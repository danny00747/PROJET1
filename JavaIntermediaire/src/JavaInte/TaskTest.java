package JavaInte;

public class TaskTest {

	public static void main(String[] args) {
		Task exam = new Task("title1", "toto");
		Task exam1 = new Task("title2","tata");
		Task exam2 = new Task("title3","momo");
		
		exam.complete();
		System.out.println(exam.title);
		System.out.println(exam2.discription);
		System.out.println(exam1.discription);
	}
}
