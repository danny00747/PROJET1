package Football;

public class Player {

	private String name;
	private int age;
	private int height;

	public Player(String name, int age, int height) {

		this.name = name;
		this.age = age;
		this.height = height;
	}

	public Player() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {

		return " Player Info ~ [" + "Name :" + name + "| Age :" + age + "| Height :" + height ;
	}

}
