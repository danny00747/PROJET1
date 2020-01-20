package Collectionz;

public class CD implements Comparable<CD> {

	private String auteur, titre;
	private double prix;

	public CD(String auteur, String titre, double prix) {
		this.auteur = auteur;
		this.titre = titre;
		this.prix = prix;
	}

	public String toString() {
		return "CD [auteur= " + auteur + ", titre= " + titre + ", prix= " + prix + "]";
	}

	public String getAuteur() {
		return auteur;
	}

	
	public String getTitre() {
		return titre;
	}

	public Double getPrix() {
		return prix;
		
		
	}

	@Override
	public int compareTo(CD other) {
		if (auteur.equals(other.getAuteur())) {
			return titre.compareTo(other.getTitre());
		} else {
			return auteur.compareTo(other.getAuteur());
		}
		//return getPrix().compareTo(other.getPrix()); (Rappel) : getPrix() double -> Double
	}
	
}
