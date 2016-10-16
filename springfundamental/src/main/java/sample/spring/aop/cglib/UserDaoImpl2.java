package sample.spring.aop.cglib;

public class UserDaoImpl2 {

	private String name;

	public void save() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("save() is called for " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void rasieException() {
		throw new RuntimeException("This is a test.");
	}

}
