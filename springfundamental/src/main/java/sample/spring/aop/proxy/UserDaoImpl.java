package sample.spring.aop.proxy;

import sample.spring.aop.UserDao;

public class UserDaoImpl implements UserDao {

	private String name;

	@Override
	public void save() {
		System.out.println("save() is called for " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
