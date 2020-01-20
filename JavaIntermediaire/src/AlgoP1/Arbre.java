package AlgoP1;

/**
 * Cette interface définit l'abstraction de base qui sera utilisée pour découpler votre
 * implémentation de la structure arborescente des tests qui emploient cette abstraction.
 */
public interface Arbre {

	/**
	 * Renvoie le 'sentiment score' calculée de facon précise.
	 *
	 * @pre  L'arbre est valide (il a pu être interprété correctement)
	 * @post Renvoie la moyenne arithmétique des scores associés aux feuilles
	 */
	double score();

	  /**
		 * Renvoie le 'poids' d'un (sous-)arbre. C'est à dire le nombre de feuilles
		 * présentes dans cet arbre.
		 *
		 * @pre  L'arbre est valide (il a pu être interprété correctement)
		 * @post Renvoie le nombre de feuilles de l'arbre.
		 */
	int poids();

}
