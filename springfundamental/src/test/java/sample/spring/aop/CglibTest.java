package sample.spring.aop;

import sample.spring.aop.cglib.CglibFactory;
import sample.spring.aop.cglib.UserDaoImpl2;

public class CglibTest {

	public static void main(String[] args) throws InterruptedException {
		CglibFactory cf = new CglibFactory();
		UserDaoImpl2 temp = new UserDaoImpl2();
		UserDaoImpl2 userDao = (UserDaoImpl2) cf.createUserDao(temp);
		userDao.save();
		temp.setName("Zhang San");
		userDao = (UserDaoImpl2) cf.createUserDao(temp);
		userDao.save();
	}

}
