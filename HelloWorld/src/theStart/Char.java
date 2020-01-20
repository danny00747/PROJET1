package theStart;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);

		System.out.print("Enter une voyelle ou un chiffre :");

		char carac = clavier.nextLine().charAt(0);
		

		clavier.close();
		
		String strg = "voyelle";
		String strg1 = "consomme";
		
		
		if (Character.isDigit(carac)) {

			System.out.println(carac + " " + "is a Number");

		} else if (carac == 'a' || carac == 'e' || carac == 'i' || carac == 'i' || carac == 'u') {

			System.out.println(Character.toUpperCase(carac) + " " + "est" + " " + strg.toUpperCase());

		} else {

			System.out.println(Character.toUpperCase(carac) + " " + "est" + " " + strg1.toUpperCase());
		}
	}
}
  
