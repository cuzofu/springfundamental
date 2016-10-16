package sample.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.spring.ioc.UserDao;

public class UserDaoTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/sample/spring/ioc/beans.xml");
		UserDao userDao = (UserDao) ctx.getBean("userDaoImpl3");
		userDao.save();

		System.out.println("=====Singleton test=====");
		UserDao userDao1A = (UserDao) ctx.getBean("userDaoImpl");
		UserDao userDao1B = (UserDao) ctx.getBean("userDaoImpl");
		System.out.println("userDao1A == userDao1B:" + (userDao1A == userDao1B));
		System.out.println("=====Prototype test=====");
		UserDao userDao2A = (UserDao) ctx.getBean("userDaoImpl2");
		UserDao userDao2B = (UserDao) ctx.getBean("userDaoImpl2");
		System.out.println("userDao2A == userDao2B:" + (userDao2A == userDao2B));
	}

}
