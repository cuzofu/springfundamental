package sample.spring.ioc;

public class UserDaoImpl implements UserDao {

	@Override
	public void save() {
		System.out.println("save() is called.");
	}

}
