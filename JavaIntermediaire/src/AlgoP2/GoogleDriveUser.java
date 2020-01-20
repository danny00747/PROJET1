package AlgoP2;

public interface GoogleDriveUser {
	/**
	 * @pre	numLine est un entier >= 0
	 * 		doc est un objet GoogleDoc comprenant un texte separe en lignes dans un ArrayList de String et un titre
	 * @post une ligne est supprimee de doc, la ligne est sauvegardee pour restauration dans l'historique de l utilisateur 
	 */
	public void removeLine(GoogleDoc doc, int numLine);
	
	/**
	 * @pre line représente une nouvelle ligne qui remplacera la ligne actuelle à la position numLine
	 *      numLine est un entier >= 0
	 * 		doc est un objet GoogleDoc comprenant un texte separe en lignes dans un ArrayList de String et un titre
	 * @post une ligne est editee dans doc, l'ancienne version est sauvegardee pour restauration dans l historique de l utilisateur 
	 */
	public void editLine(GoogleDoc doc, int numLine, String line);

	/**
	 * @pre line représente une nouvelle ligne à ajouter au doc à la position numLine
	 *      numLine est un entier >= 0
	 * 		doc est un objet GoogleDoc comprenant un texte separe en lignes dans un ArrayList de String et un titre
	 * @post une ligne est ajoutee dans doc, l index est sauvegardee pour restauration a une version sans la ligne dans l historique de l utilisateur 
	 */
	public void addLine(GoogleDoc doc, int numLine, String line);
	
	/**
	 * @pre doc est un objet GoogleDoc comprenant un texte separe en lignes dans un ArrayList de String et un titre
	 * @post la derniere modification realisee par l utilisateur est restauree dans doc
	 */
	public void restore(GoogleDoc doc);
}
