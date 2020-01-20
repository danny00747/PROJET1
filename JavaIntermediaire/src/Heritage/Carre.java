package Heritage;

public class Carre extends Forme {
	
	private int cote;

	public Carre(int cote) {
		
		this.cote = cote;
	}

	@Override
	public double aire() {

		return (cote * cote);
	}
	
	public double perimetre(int n) {

		return this.aire() * n;
	}
	
	

	public int getCote() {
		return cote;
	}

	public void setCote(int cote) {
		this.cote = cote;
	}

}
