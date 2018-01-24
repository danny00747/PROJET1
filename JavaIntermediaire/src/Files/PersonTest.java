package Files;

import java.text.ParseException;

public class PersonTest {

	public static void main(String[] args) {

		Person personne = new Person("Daniel", "Olivier");

		try {
			 personne.setAge("22");
			 //personne.setAge(3);
			 
		}catch (IllegalArgumentException e) {
			System.err.println("IllegalArgumentException :" + e.getMessage());
			System.out.println();
		}  catch (ParseException e) {
			System.err.println("ParseException : " + e.getMessage());
		}  

		System.out.println(personne.toString());

	}

}
