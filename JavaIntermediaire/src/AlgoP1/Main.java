package AlgoP1;

/**
 * Cette classe a pour but de vous permettre de valider plus facilement le
 * r�sultat de votre travail. Elle impl�mente une m�thode main() **qui ne sera
 * en aucun cas appel�e** lors de l'�valuation de votre travail sur INGInious.
 *
 * Pour aller plus loin (Optionnel): --------------------------------- Ceux qui
 * veulent effectuer une v�rification plus robuste de leur solution sont invit�s
 * � �crire une suite de tests JUnit pour valider le comportement des/de l'
 * impl�mentation(s) de l'interface Arbre que vous avez r�alis� ainsi que celui
 * de la m�thode 'creerArbre' dans la classe ArbreFactory.
 */
public class Main {
	/**
	 * Ceci est le point d'entr�e principal d'une application toute simple qui vous
	 * permet de facilement valider le r�sultat de votre travail.
	 *
	 * Attention: ---------- Cette m�thode ne sera **en aucun cas appel�e** lors de
	 * l'�valuation de votre travail sur INGInious.
	 */
	public static double H (int N, double res) {
		if (N < 1) return res; // Cas de base (d�fensif)
		return H(N-1, res + 1.0/N); // R�cursion terminale
		}
		public static void main(String args[]) {
		int N = 6;
		System.out.println(H(N, 0.0));
		}
		}
	

