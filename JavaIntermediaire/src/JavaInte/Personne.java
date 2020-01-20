package JavaInte;

import java.util.Comparator;

public class Personne implements Comparator<Personne>{
	public String nom;
	private String prenom;
	private String middle;
	private int age;
	private int ages;
	public static int nbr;
	Personne other;
	public int length;

	public final static int MAXHEARS = 6;

	private static int nombresDesPersonnes;

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.setMiddle(middle);
		nombresDesPersonnes++;
		System.err.println("SUPERRRRR");

	}

	/*
	 * other way to create a constructor
	 */
	public Personne() {
		System.out.println("constructor 1");

	}

	public Personne(int nbr) {
		Personne.nbr = nbr;

	}

	public int setMethod(int n, int m) {
		return n * m;
	}

	public int getMethod(int n, int m, int k) {
		return this.setMethod(n, m) * k;
	}

	/*
	 * surcharge de la methode fulltitle
	 */
	public String fulltitle() {
		return this.getNom() + " " + this.getPrenom();
	}

	/*
	 * surcharge de la methode fulltitle
	 */
	public String fulltitle(String debut) {
		return debut + this.fulltitle();
	}

	public static int getnombresDesPersonnes() {
		return nombresDesPersonnes;
	}

	public void setAge(int age) {
		if (age < 15) {
			throw new IllegalArgumentException("too young kid");
		} else {
			this.age = age;
		}
	}

	public int getAge() {
		return this.age + 10;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMiddle() {
		return this.middle;
	}

	public void setMiddle(String middle) {
		this.middle = middle;

	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public boolean equals(Personne o) {
		if (this.fulltitle().equals(o.fulltitle())) {
			return true;
		}
		return false;
	}

	public static class Homme {

		public static int aged;

		public static void affichage() {
			System.out.println("nested classes");
		}

	}

	@Override
	public int compare(Personne o1, Personne o2) {
		return o1.getNom().compareTo(o2.getNom());
	}

}
