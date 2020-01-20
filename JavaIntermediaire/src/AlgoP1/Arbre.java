package AlgoP1;

/**
 * Cette interface d�finit l'abstraction de base qui sera utilis�e pour d�coupler votre
 * impl�mentation de la structure arborescente des tests qui emploient cette abstraction.
 */
public interface Arbre {

	/**
	 * Renvoie le 'sentiment score' calcul�e de facon pr�cise.
	 *
	 * @pre  L'arbre est valide (il a pu �tre interpr�t� correctement)
	 * @post Renvoie la moyenne arithm�tique des scores associ�s aux feuilles
	 */
	double score();

	  /**
		 * Renvoie le 'poids' d'un (sous-)arbre. C'est � dire le nombre de feuilles
		 * pr�sentes dans cet arbre.
		 *
		 * @pre  L'arbre est valide (il a pu �tre interpr�t� correctement)
		 * @post Renvoie le nombre de feuilles de l'arbre.
		 */
	int poids();

}
