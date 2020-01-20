package AlgoP1;

/**
 * Cette classe a pour but de vous permettre de valider plus facilement le
 * résultat de votre travail. Elle implémente une méthode main() **qui ne sera
 * en aucun cas appelée** lors de l'évaluation de votre travail sur INGInious.
 *
 * Pour aller plus loin (Optionnel): --------------------------------- Ceux qui
 * veulent effectuer une vérification plus robuste de leur solution sont invités
 * à écrire une suite de tests JUnit pour valider le comportement des/de l'
 * implémentation(s) de l'interface Arbre que vous avez réalisé ainsi que celui
 * de la méthode 'creerArbre' dans la classe ArbreFactory.
 */
public class Main {
	/**
	 * Ceci est le point d'entrée principal d'une application toute simple qui vous
	 * permet de facilement valider le résultat de votre travail.
	 *
	 * Attention: ---------- Cette méthode ne sera **en aucun cas appelée** lors de
	 * l'évaluation de votre travail sur INGInious.
	 */
	public static double H (int N, double res) {
		if (N < 1) return res; // Cas de base (défensif)
		return H(N-1, res + 1.0/N); // Récursion terminale
		}
		public static void main(String args[]) {
		int N = 6;
		System.out.println(H(N, 0.0));
		}
		}
	

