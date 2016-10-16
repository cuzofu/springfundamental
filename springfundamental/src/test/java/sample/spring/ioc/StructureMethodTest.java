package sample.spring.ioc;

import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.spring.ioc.bean.UserServiceBean;

public class StructureMethodTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/sample/spring/ioc/beans.xml");
		UserServiceBean userService = (UserServiceBean) ctx.getBean("userService2");
		System.out.println("编号：" + userService.getUserId());
		System.out.println("姓名：" + userService.getUserName());
		System.out.println("爱好：");
		for (String hobby : userService.getHobbies()) {
			System.out.println(hobby);
		}
		System.out.println("学习成绩：");
		for (Entry<String, Integer> entry : userService.getScores().entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
		userService.getUserDao().save();
	}

}
