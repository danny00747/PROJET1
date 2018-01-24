package JavaInte;

public class Task {
	public String discription;
	public String title;
	public boolean completed = false;

	public Task(String title, String description) {
		this.discription = description;
		this.title = title;
	}

	public void complete() {
		completed = true;
		//System.out.println("java interm");
	}

}
