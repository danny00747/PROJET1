package JavaInte;

public class ClassB extends Personne {
	private String nom;
	private String prenom;
	private String middle;
	public int nbr;
	public String[] strg = { "dan", "oli", "niyo" };

	public ClassB(String nom, String prenom) {

		System.out.println(super.getMethod(2, 2, 2));
		System.out.println(super.getAge());

		this.nom = nom;
		this.prenom = prenom;

	}

	public ClassB(String nom, String prenom, String middle) {

		this(nom, prenom);
		this.middle = middle;

	}

	public ClassB(String nom) {
		this.nom = nom;
	}

	/*
	 * public String fulltitle() { super.fulltitle(prenom); return prenom;
	 * 
	 * }
	 */
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMiddle() {
		return middle;
	}

	public void setMiddle(String middle) {
		this.middle = middle;
	}

	
	public boolean equals(ClassB o) {
		if(this.getNom().equals(o.getNom())) {
			return true;
		}
		return false;
	}
	
	public String fulltitleB() {
		return this.getNom() + " " + this.getPrenom();
	}

	public boolean contains1(Personne other) {
		if (other instanceof ClassB) {
			ClassB ab = (ClassB) other;
			for (int i = 0; i < strg.length; i++) {
				if (strg.equals(ab)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean contains(String s) {
		// TODO Auto-generated method stub
		return false;
	}
}

/*
 * String[] string1 = { "dan", "oli", "iii" }; for (int i = 0; i <
 * string1.length; i++) { for (int j = 0; j < a.length(); j++) { if
 * (string1[i].equals(a)) {
 * 
 * return true; } } } return false;
 */
