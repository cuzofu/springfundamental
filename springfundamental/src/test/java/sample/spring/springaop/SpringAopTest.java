package sample.spring.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.spring.aop.UserDao;
import sample.spring.aop.cglib.UserDaoImpl2;

public class SpringAopTest {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/sample/spring/ioc/spring-aop.xml");
		UserDao userDao = (UserDao) ctx.getBean("userDaoImpl");
		userDao.save();
		UserDaoImpl2 userDao2 = (UserDaoImpl2) ctx.getBean("userDaoImpl2");
		userDao2.save();
		userDao2.setName("Zhang San");
		userDao2.save();
		userDao2.rasieException();
	}

}
