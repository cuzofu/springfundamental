package sample.spring.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory implements InvocationHandler {

	private Object target;

	public Object createUserDao(Object target) {
		this.target = target;
		return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(),
				this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		UserDaoImpl userDao = (UserDaoImpl) target;
		Object result = null;
		if (userDao.getName() != null) {
			result = method.invoke(target, args);
		} else {
			System.out.println("The name is null.");
		}
		return result;
	}

}
