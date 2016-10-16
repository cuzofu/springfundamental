package sample.spring.ioc.bean;

import java.util.List;
import java.util.Map;

import sample.spring.ioc.UserDao;

public class UserServiceBean {
	private int userId;
	private String userName;
	private UserDao userDao;
	private List<String> hobbies;
	private Map<String, Integer> scores;

	public UserServiceBean(int userId, String userName, UserDao userDao, List<String> hobbies,
			Map<String, Integer> scores) {
		System.out.println("Structure UserSserviceBean Start.");
		this.userId = userId;
		this.userName = userName;
		this.userDao = userDao;
		this.hobbies = hobbies;
		this.scores = scores;
		System.out.println("Structure UserSserviceBean End.");
	}

	public UserServiceBean() {
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setScores(Map<String, Integer> scores) {
		this.scores = scores;
	}

	public Map<String, Integer> getScores() {
		return scores;
	}
}
