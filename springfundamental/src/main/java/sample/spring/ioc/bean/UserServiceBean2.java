package sample.spring.ioc.bean;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sample.spring.ioc.UserDao;

public class UserServiceBean2 {
	private String userID;
	private String userName;

	@Resource(name = "userDaoImpl2")
	private UserDao userDao1;
	@Resource(name = "userDaoImpl2")
	private UserDao userDao2;

	@Autowired(required = false)
	@Qualifier("userDaoImpl1")
	private UserDao userDao3;

	@Autowired(required = false)
	@Qualifier("userDaoImpl3")
	private UserDao userDao4;

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	@Resource
	public void setUserDao2(UserDao userDao2) {
		this.userDao2 = userDao2;
	}

	public UserDao getUserDao2() {
		return userDao2;
	}

	public void test() {
		userDao1.save();
		userDao2.save();
		System.out.println(userDao3.getClass().getName());
		userDao3.save();
		userDao4.save();
	}
}
