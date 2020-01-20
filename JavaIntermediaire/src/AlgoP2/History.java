package AlgoP2;

public class History {

	private static int ADDITION = 1;
	private static int DELETE = -1;
	private static int ADD = 5;
	private int numLine = 2;
	private User user = null;
	public static int typeMod = 10;
	private GoogleDoc doc = null;
	private String ancienPhrase = null;
	private String deletedLine = null;
	private String nouveauPhrase = null;

	public History(GoogleDoc doc, int numLine, String nouveauPhrase, int typeMod) {
		this.doc = doc;
		this.numLine = numLine;
		this.nouveauPhrase = nouveauPhrase;
		History.typeMod = typeMod;
	}

	public static int getADDATION() {
		return ADDITION;
	}

	public static void setADDATION(int aDDATION) {
		ADDITION = aDDATION;
	}

	public static int getDELETE() {
		return DELETE;
	}

	public static void setDELETE(int dELETE) {
		DELETE = dELETE;
	}

	public static int getADD() {
		return ADD;
	}

	public static void setADD(int aDD) {
		ADD = aDD;
	}

	public int getNumLine() {
		return numLine;
	}

	public void setNumLine(int numLine) {
		this.numLine = numLine;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public GoogleDoc getDoc() {
		return this.doc;
	}

	public void setDoc(GoogleDoc doc) {
		this.doc = doc;
	}

	public String getAncienPhrase() {
		return ancienPhrase;
	}

	public void setAncienPhrase(String ancienPhrase) {
		this.ancienPhrase = ancienPhrase;
	}

	public String getNouveauPhrase() {
		return nouveauPhrase;
	}

	public void setNouveauPhrase(String nouveauPhrase) {
		this.nouveauPhrase = nouveauPhrase;
	}

	public int getTypeMod() {
		return typeMod;
	}

	public void setTypeMod(int typeMod) {
		History.typeMod = typeMod;
	}

	public void execute() {

		if (typeMod == -1) {
			if (numLine >= doc.getFile().size()) {
				return;
			} else {
				deletedLine = doc.getFile().get(numLine);
				doc.getFile().remove(numLine);
			}
		} else if (typeMod == 1) {
			if (numLine > doc.getFile().size()) {
				numLine = doc.getFile().size();
			}
			doc.getFile().add(numLine, nouveauPhrase);
		} else if (typeMod == 0) {
			if (numLine >= doc.getFile().size()) {
				return;
			}
			deletedLine = doc.getFile().get(numLine);
			doc.getFile().set(numLine, nouveauPhrase);
		}
	}

	public void inverse() {
		if (typeMod == -1) {
			if (numLine > doc.getFile().size()) {
				numLine = doc.getFile().size();
			}
			doc.getFile().add(numLine, nouveauPhrase);
		} else if (typeMod == 1) {
			if (numLine >= doc.getFile().size()) {
				return;
			} else {
				deletedLine = doc.getFile().get(numLine);
				doc.getFile().remove(numLine);
			}
		}

	}
}
