package AlgoP1;

/**
 * Cette classe sert à instancier un objet implémentant l'interface Arbre pour
 * représenter une phrase annotée en utilisant les classes que **vous** avez
 * définies.
 * 
 * #########################################################################################
 * 
 * Note: ---- On applique ici un "pattern singleton" à savoir: on force à ce
 * qu'il n'y ait qu'une et une seule instance de la classe ArbreFactory dans
 * toute la JVM. Ceci est réalisé en ne permettant pas au monde extérieur
 * d'avoir accès au constructeur de la classe et en stockant l'instance unique
 * de ArbreFactory dans un champ static final.
 * 
 * Une classe cliente (par exemple un 'main') peut obtenir une référence vers
 * cette instance unique au travers de la méthode 'getInstance()'.
 * 
 * 
 */
public class ArbreFactory {

	/**
	 * La seule et unique instance existante de cette classe.
	 */
	private static final ArbreFactory INSTANCE = new ArbreFactory();

	/**
	 * On empèche le monde extérieur de créer une nouvelle instance de ArbreFactory.
	 * ==> cela n'aurait de sens pour personne.
	 */
	private ArbreFactory() {
	}

	/**
	 * On permet d'accéder à l'instance unique de la classe.
	 * 
	 * @pre Aucune
	 * @post Renvoie une référence vers l'instance unique de ArbreFactory
	 */
	public static ArbreFactory getInstance() {
		return INSTANCE;
	}

	/**
	 * Cette méthode permet de créer une instance d'Arbre correspondant à l'arbre
	 * encodée dans la chaine de caractères en forme parenthésée.
	 * 
	 * @pre Le paramètre formeParenthesee est une chaine de caractères qui encode un
	 *      arbre d'analyse valide.
	 * @post Renvoie une instance (de votre classe implémentant l'interface) Arbre
	 *       correspondant à ce qui est encodé dans formeParenthesee.
	 * 
	 * @exc Si la précondition devait être violée lors de l'appel à cette méthode,
	 *      vous êtes autorisés à lever une exception de type
	 *      IllegalArgumentException (il s'agit d'un type standard en Java).
	 */
	public Arbre creerArbre(String formeParenthesee) {

		return null;
	}

}
