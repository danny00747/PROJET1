package Heritage;

import java.util.Scanner;

public class FormeTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.err.println(new Triangle(3, 4).toString() + " " + "c juste un exemple");
		System.out.println();
		System.out.println("Ce programme calcule l'aire du Carre(c), Triangle(t) et du Cercle(cl).");
		System.out.println();
		System.out.println("Entre la forme dont vous voulez calculer :");

		String[] tab = new String[3];
		tab[0] = "c";
		tab[1] = "t";
		tab[2] = "cl";

		String user = scanner.nextLine();

		if (user.equals(tab[0])) {
			System.out.println("Entre votre cote :");
			int cote = scanner.nextInt();
			System.out.println("L'aire de votre carré est : " + new Carre(cote).aire());
			System.out.println("Et le perimètre de votre carré est : " + new Carre(cote).perimetre(4));

		} else if (user.equals(tab[1])) {
			System.out.println("Entre votre base :");
			int base = scanner.nextInt();
			System.out.println("Entre votre hauteur :");
			int hauteur = scanner.nextInt();
			System.out.println("L'aire du votre triangle est : " + new Triangle(base, hauteur).aire());

		} else if (user.equals(tab[2])) {
			System.out.println("Entre votre rayon :");
			int rayon = scanner.nextInt();
			System.out.println("Le rayon de votre cercle est : " + rayon);
			System.out.println("Le diamètre de votre cercle est : " + new Cercle(rayon).diamètre());
			System.out.println("La circonférence de votre cercle est : " + new Cercle(rayon).circonférence());
			System.out.println("L'aire de votre cercle est : " + new Cercle(rayon).aire());
			System.out.println("L'aire de votre cercle est : " + new Cercle(rayon));
		} else {

			System.out.println("! relancer le programe et écrivez bien la forme. Merci");
		}
		scanner.close();
	}

}
