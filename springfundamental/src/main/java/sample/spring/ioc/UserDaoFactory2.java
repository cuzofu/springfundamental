package sample.spring.ioc;

public class UserDaoFactory2 {

	public UserDao getUserDao() {
		return new UserDaoImpl();
	}

}
