package AlgoP1;

/**
 * Cette classe sert � instancier un objet impl�mentant l'interface Arbre pour
 * repr�senter une phrase annot�e en utilisant les classes que **vous** avez
 * d�finies.
 * 
 * #########################################################################################
 * 
 * Note: ---- On applique ici un "pattern singleton" � savoir: on force � ce
 * qu'il n'y ait qu'une et une seule instance de la classe ArbreFactory dans
 * toute la JVM. Ceci est r�alis� en ne permettant pas au monde ext�rieur
 * d'avoir acc�s au constructeur de la classe et en stockant l'instance unique
 * de ArbreFactory dans un champ static final.
 * 
 * Une classe cliente (par exemple un 'main') peut obtenir une r�f�rence vers
 * cette instance unique au travers de la m�thode 'getInstance()'.
 * 
 * 
 */
public class ArbreFactory {

	/**
	 * La seule et unique instance existante de cette classe.
	 */
	private static final ArbreFactory INSTANCE = new ArbreFactory();

	/**
	 * On emp�che le monde ext�rieur de cr�er une nouvelle instance de ArbreFactory.
	 * ==> cela n'aurait de sens pour personne.
	 */
	private ArbreFactory() {
	}

	/**
	 * On permet d'acc�der � l'instance unique de la classe.
	 * 
	 * @pre Aucune
	 * @post Renvoie une r�f�rence vers l'instance unique de ArbreFactory
	 */
	public static ArbreFactory getInstance() {
		return INSTANCE;
	}

	/**
	 * Cette m�thode permet de cr�er une instance d'Arbre correspondant � l'arbre
	 * encod�e dans la chaine de caract�res en forme parenth�s�e.
	 * 
	 * @pre Le param�tre formeParenthesee est une chaine de caract�res qui encode un
	 *      arbre d'analyse valide.
	 * @post Renvoie une instance (de votre classe impl�mentant l'interface) Arbre
	 *       correspondant � ce qui est encod� dans formeParenthesee.
	 * 
	 * @exc Si la pr�condition devait �tre viol�e lors de l'appel � cette m�thode,
	 *      vous �tes autoris�s � lever une exception de type
	 *      IllegalArgumentException (il s'agit d'un type standard en Java).
	 */
	public Arbre creerArbre(String formeParenthesee) {

		return null;
	}

}
