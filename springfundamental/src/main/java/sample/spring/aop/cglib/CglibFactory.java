package sample.spring.aop.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibFactory implements MethodInterceptor {

	private Object target;

	public Object createUserDao(Object target) {
		this.target = target;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		UserDaoImpl2 userDao = (UserDaoImpl2) target;
		if (userDao.getName() != null) {
			return method.invoke(target, args);
		} else {
			System.out.println("The name is null.");
		}

		return target;
	}

}
