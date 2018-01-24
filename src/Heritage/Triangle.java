package Heritage;

public class Triangle extends Forme {
	private int base;
	private int hauteur;

	public Triangle(int base, int hauteur) {
		
		this.base = base;
		this.hauteur = hauteur;
	}

	@Override
	public double aire() {

		return (base * hauteur) / 2;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	public String toString() {
		String s = this.base + ":" + this.hauteur; 
		return s;
	}
	public String toString(String a) {
		
		return a;
		
	}

}
