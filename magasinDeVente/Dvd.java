package magasinDeVente;

public class Dvd extends Article {
	
	private int dureeMinutes;
	
//declarer realisateur comme une nouvelle personne
	private Personne directeur;
	


	//Getter & Setter
	public int getDureeMinutes() {
		return dureeMinutes;
	}
	public void setDureeMinutes(int dureeMinutes) {
		this.dureeMinutes = dureeMinutes;
	}
	public Personne getDirecteur() {
		return directeur;
	}
	public void setDirecteur(Personne directeur) {
		this.directeur = directeur;
	}
		
	/**
	 * Attribute de Livre
	 */

	//La contruction défault
	public Dvd() {
		dureeMinutes = 90;
		directeur = new Personne();
	}
	
	//La contruction avec les paramettres
	public Dvd(int dureeMinutes) {
		setDureeMinutes(dureeMinutes);
	}


	/**
	 * Les méthodes
	 */

	public void affichage() {
		super.affichage();
		System.out.println("La durée de Dvd: " + getDureeMinutes());
		System.out.println("Le nom de réalisateur: " + this.directeur.getNom());
		System.out.println("Le nom de réalisateur: " + this.directeur.getPrenom());
	}
}


