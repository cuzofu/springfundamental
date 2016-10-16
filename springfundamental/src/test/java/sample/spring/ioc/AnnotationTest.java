package sample.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.spring.ioc.bean.UserServiceBean2;

public class AnnotationTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/sample/spring/ioc/annotation.xml");
		UserServiceBean2 userService = (UserServiceBean2) ctx.getBean("userService");

		userService.test();

	}

}
