package Test;

public class Student {
	
	private String nom;
	private String prenom;
	private static int noma;
	public static int count; 

	
	public Student(String nom, String prenom) {
		
		this.nom = nom;
		this.prenom = prenom;
	
		
				
	}


	public String getNom() {
		return nom ;
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
	
	@Override
	public String toString() {
	
		return "Nom : " + getNom() + " " +
				"prenom : " + prenom + " " +
				"NOMA : " + Student.count++ ;			
	}
	
}
