package JavaInte;

import java.util.Scanner;

public class Dessin {
	 public static void main (String [] args) {
	        boolean avec = true;
	        Fenetre fenetre = new Fenetre();
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Combien de coté voulez-vous ?");
	        int cote = scan.nextInt();
	        fenetre.dessine(50, cote);
	        //System.out.println("voulez-vous le dessin en V2 (true/false)");
	        if (avec) {
	            fenetre.dessine2(50, cote);
	        }
	        
	    }
}
