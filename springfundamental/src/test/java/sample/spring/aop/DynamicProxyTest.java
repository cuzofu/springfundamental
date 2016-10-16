package sample.spring.aop;

import sample.spring.aop.proxy.ProxyFactory;
import sample.spring.aop.proxy.UserDaoImpl;

public class DynamicProxyTest {

	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		UserDao userDao = (UserDao) pf.createUserDao(new UserDaoImpl());

		userDao.save();
	}

}
