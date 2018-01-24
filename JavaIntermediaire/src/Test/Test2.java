package Test;

public class Test2 extends Test1 {
	private String nom;
	private String nom1;
	private String nom2;


	public Test2(String nom, String nom1, String nom2) {
		
		super(nom, nom1, nom2);
		super.fulltitle123();

		this.nom = nom;
		this.nom1 = nom;
		this.nom2 = nom;
		System.out.println("rt");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom1() {
		return nom1;
	}

	public void setNom1(String nom1) {
		this.nom1 = nom1;
	}

	public String getNom2() {
		return nom2;
	}

	public void setNom2(String nom2) {
		this.nom2 = nom2;
	}

	public String fulltitle2() {
		return this.getNom() + " " + this.getNom1() + " " + this.getNom2();

	}

}
