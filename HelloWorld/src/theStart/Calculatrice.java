package theStart;

import java.util.Scanner;

public class Calculatrice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nbr1;
		int nbr2;
		
			System.out.print("Enter nbr1 :");
			nbr1 = scanner.nextInt();

			System.out.print("Enter nbr2 :");
			nbr2 = scanner.nextInt();

			System.out.println("la somme est " + (nbr1 + nbr2));
			System.out.println("la multi est " + (nbr1 * nbr2));
			System.out.println("la sub est " + (nbr1 - nbr2));
			System.out.println("la racine carr� est du nbr2 est " + Math.sqrt(nbr2));
			

		scanner.close();
	

}}
