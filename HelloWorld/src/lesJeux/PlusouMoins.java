package lesJeux;

import java.util.Random;
import java.util.Scanner;

public class PlusouMoins {

	public static void main(String[] args) {

		int user_number;
		Scanner scanner = new Scanner(System.in);
		int secret_number = new Random().nextInt(999) + 1;
		do {
			System.out.print("Entre un chiffre en 1-1000 :");
			user_number = scanner.nextInt(); 
			if (user_number == secret_number) {
				System.out.println("Felicitations !");
			} else if (user_number > secret_number) {
				System.out.println(user_number + " " + "est tres grand");
			} else {
				System.out.println(user_number + " " + "est tres petit");
			}
		} while (user_number != secret_number);
		scanner.close();
	}
}
