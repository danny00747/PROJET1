package Heritage;

public class Cercle extends Forme {
	private int rayon;

	public Cercle(int rayon) {

		this.rayon = rayon;
	}

	@Override
	public double aire() {

		return Math.PI * (rayon * rayon);
	}

	public double diamètre() {

		return this.getRayon() * 2;
	}

	public double circonférence() {

		return Math.PI * this.getRayon() * 2;
	}

	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}
	
	@Override
	public String toString() {
		
		return "[" + rayon + "]";
	}

}
