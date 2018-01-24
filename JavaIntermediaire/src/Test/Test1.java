package Test;

public class Test1 {
	private String name;
	private String name1;
	private String name2;

	public Test1(String name, String name1, String name2) {

		this.name = name;
		this.name1 = name1;
		this.name2 = name2;
		System.out.println("OK2");
	}

	public Test1() {
		System.out.println("ok");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String fulltitle1() {
		//System.out.println("ok33");
		return this.getName() + " " + this.getName1() + " " + this.getName2();
	}
	public String fulltitle123() {
		System.out.println("ok33");
		return this.getName() ;
		
	}

}
