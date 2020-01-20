package AlgoP2;

import java.util.ArrayList;

public class Main {
	
	public Main() {
		main(null);
	}

	public void main(String[] args) {
		testMultiUser();
		testLineAddition();
		testEOFLineAddition();
		testLineRemoval();
		testBeyondSizeLineAddition();
		testBeyondSizeLineRemoval();
		testMultiDoc();
		testRestore();
		testLineEdition();
		System.out.println("Tests terminés");
		
	}
		

	GoogleDoc generateDoc(int i) {
		ArrayList<String> file = new ArrayList<String>();
		file.add("La peur est le chemin vers le côté obscur");
		file.add("la peur mène à la colère");
		file.add("la colère mène à la haine");
		file.add("la haine mène à la souffrance.");
		GoogleDoc doc = new GoogleDoc("SW test" + i, file);
		return doc;
	}

	// Equality between docs
	boolean docEquality(GoogleDoc doc, GoogleDoc toCompare) {
		return doc.equals(toCompare);
	}

	// Required test: Addition of a line
	boolean testLineAddition(boolean preTest) {
		GoogleDoc doc = generateDoc(0);
		GoogleDoc original = generateDoc(0);
		User u0 = new User("Test0");

		u0.addLine(doc, 2, u0.getPseudo() + ": ceci est un test0");
		original.getFile().add(2, u0.getPseudo() + ": ceci est un test0");

		return docEquality(doc, original);
	}

	// Addition of a line
	void testLineAddition() {
		if (!testLineAddition(true))
			fail("Your addLine method doesn't work.");
	}

	// Addition of a line at the end of the file
	void testEOFLineAddition() {
		if (!testLineAddition(true))
			fail("Your addLine method doesn't work.");
		GoogleDoc doc = generateDoc(0);
		GoogleDoc original = generateDoc(0);
		User u0 = new User("Test0");

		u0.addLine(doc, 4, u0.getPseudo() + ": ceci est un test0");
		original.getFile().add(4, u0.getPseudo() + ": ceci est un test0");

		if (!docEquality(doc, original))
			fail("You tried to add a line after the end of the file and didn't handle it right");
	}

	// Addition of a line beyond the end of the file
	void testBeyondSizeLineAddition() {
		if (!testLineAddition(true))
			fail("Your addLine method doesn't work.");
		GoogleDoc doc = generateDoc(0);
		GoogleDoc original = generateDoc(0);
		User u0 = new User("Test0");

		u0.addLine(doc, 7, u0.getPseudo() + ": ceci est un test0");
		original.getFile().add(4, u0.getPseudo() + ": ceci est un test0");

		if (!docEquality(doc, original))
			fail("You tried to add a line after the end of the file and you didn't handle it right");
	}

	// REMOVAL

	// Required test: Removal of a line
	boolean testLineRemoval(boolean preTest) {
		GoogleDoc doc = generateDoc(0);
		GoogleDoc original = generateDoc(0);
		User u0 = new User("Test0");

		u0.removeLine(doc, 2);
		original.getFile().remove(2);

		return docEquality(doc, original);
	}

	// Removal of a line
	void testLineRemoval() {
		if (!testLineRemoval(true))
			fail("Your removeLine method doesn't work.");
	}

	// Removal of a line beyond the end of the file
	void testBeyondSizeLineRemoval() {
		if (!testLineRemoval(true))
			fail("Your removeLine method doesn't work.");
		GoogleDoc doc = generateDoc(0);
		GoogleDoc original = generateDoc(0);
		User u0 = new User("Test0");

		u0.removeLine(doc, 7);

		if (!docEquality(doc, original))
			fail("You tried to remove a line after the end of the file and you didn't handle it right");
	}

	// EDITION

	// Edition of a line test
	void testLineEdition() {
		GoogleDoc doc = generateDoc(0);
		GoogleDoc original = generateDoc(0);
		User u0 = new User("Test0");

		u0.editLine(doc, 2, doc.getFile().get(2) + "test d'un ajout.");
		String s = original.getFile().get(2);
		original.getFile().remove(2);
		original.getFile().add(2, s + "test d'un ajout.");

		if (!docEquality(doc, original))
			fail("You tried to remove a line after the end of the file and you didn't handle it right");
	}

	// RESTORATION

	// Required test: Restoration of an editon
	boolean testRestore(boolean preTest) {
		GoogleDoc doc = generateDoc(0);
		User u0 = new User("Test0");

		u0.addLine(doc, 2, u0.getPseudo() + ": ceci est un test0");
		u0.removeLine(doc, 1);
		u0.addLine(doc, 2, doc.getFile().get(2) + "test d'un ajout.");

		u0.restore(doc);
		u0.restore(doc);
		u0.restore(doc);

		return docEquality(doc, generateDoc(0));
	}

	// Restoration of an edition
	void testRestore() {
		if (!testLineRemoval(true))
			fail("Your removeLine method doesn't work.");
		if (!testLineAddition(true))
			fail("Your addLine method doesn't work.");
		if (!testRestore(true))
			fail("Your restore method doesn't work.");
	}

	// Restoration of editions from multiple docs
	void testMultiDoc() {
		if (!testRestore(true))
			fail("Your restore method doesn't work.");
		if (!testLineRemoval(true))
			fail("Your removeLine method doesn't work.");
		if (!testLineAddition(true))
			fail("Your addLine method doesn't work.");
		GoogleDoc doc0 = generateDoc(0);
		GoogleDoc compare0 = generateDoc(0);
		GoogleDoc doc1 = generateDoc(1);
		User u0 = new User("Test0");

		u0.addLine(doc1, 2, u0.getPseudo() + ": ceci est un test0");
		u0.removeLine(doc0, 1);
		compare0.getFile().remove(1);
		u0.addLine(doc1, 2, doc1.getFile().get(2) + "test d'un ajout.");

		u0.restore(doc1);
		u0.restore(doc1);

		if (!(docEquality(doc1, generateDoc(1)) && docEquality(doc0, compare0)))
			fail("Your implementation doesn't handle multiple docs for one user.");
	}

	// Required test: Restoration attempt with empty history
	Boolean testEmptyHistory(boolean preTest) {
		if (!testLineAddition(true))
			fail("Your addLine method doesn't work.");
		if (!testRestore(true))
			fail("Your restore method doesn't work.");
		GoogleDoc doc = generateDoc(0);
		User u0 = new User("Test0");

		u0.addLine(doc, doc.getFile().size(), u0.getPseudo() + ": ceci est un test0");
		u0.restore(doc);
		u0.restore(doc);

		return (docEquality(doc, generateDoc(0)));
	}

	// Restoration attempt with empty history
	void testEmptyHistory() {
		if (!testEmptyHistory(true))
			fail("You tried to restore beyond the capacity of your user's history.");
	}

	// Restoration of edition from multiple users
	void testMultiUser() {
		if (!testRestore(true))
			fail("Your restore method doesn't work.");
		if (!testLineRemoval(true))
			fail("Your removeLine method doesn't work.");
		if (!testLineAddition(true))
			fail("Your addLine method doesn't work.");
		if (!testEmptyHistory(true))
			fail("You tried to restore beyond the capacity of your user's history.");
		GoogleDoc doc = generateDoc(0);
		GoogleDoc compare = generateDoc(0);
		User u0 = new User("Test0");
		User u1 = new User("Test1");

		u0.addLine(doc, doc.getFile().size(), u0.getPseudo() + ": ceci est un test0");
		u0.addLine(doc, doc.getFile().size(), u0.getPseudo() + ": ceci est un test1");
		compare.getFile().add(u0.getPseudo() + ": ceci est un test0");
		compare.getFile().add(u0.getPseudo() + ": ceci est un test1");

		u1.addLine(doc, doc.getFile().size(), u1.getPseudo() + ": ceci est un test1");
		u1.restore(doc);
		u1.restore(doc);

		if (!docEquality(doc, compare))
			fail("Your implementation doesn't handle multiple users.");
	}

	public void fail(String p) {
		System.out.println(p);
	}
}
