package AlgoP2;

import java.util.ArrayList;

public class User implements GoogleDriveUser {

	User pseudo;
	ArrayList<User> history;
	ArrayList<User> users;

	public User(String file) {

	}

	public User(User pseudo) {
		this.pseudo = pseudo;
		history = null;
	}

	/*
	 * @pre numLine est un entier >= 0 doc est un objet GoogleDoc comprenant un
	 * texte separe en lignes dans un ArrayList de String et un titre
	 * 
	 * @post une ligne est supprimee de doc, la ligne est sauvegardee pour
	 * restauration dans l'historique de l utilisateur
	 */
	@Override
	public void removeLine(GoogleDoc doc, int numLine) {

	}

	@Override

	public void editLine(GoogleDoc doc, int numLine, String line) {
		History hist = new History(doc, numLine, line, History.typeMod);
		hist.execute();
		doc.addModif(this, hist);

	}

	@Override
	public void addLine(GoogleDoc doc, int numLine, String line) {
		History hist = new History(doc, numLine, line, History.typeMod);
		hist.execute();
		doc.addModif(this, hist);
	}

	@Override
	public void restore(GoogleDoc doc) {
		doc.restore(this);
	}

	public User getPseudo() {

		return pseudo;
	}

}
