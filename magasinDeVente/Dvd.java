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

	//La contruction d�fault
	public Dvd() {
		dureeMinutes = 90;
		directeur = new Personne();
	}
	
	//La contruction avec les paramettres
	public Dvd(int dureeMinutes) {
		setDureeMinutes(dureeMinutes);
	}


	/**
	 * Les m�thodes
	 */

	public void affichage() {
		super.affichage();
		System.out.println("La dur�e de Dvd: " + getDureeMinutes());
		System.out.println("Le nom de r�alisateur: " + this.directeur.getNom());
		System.out.println("Le nom de r�alisateur: " + this.directeur.getPrenom());
	}
}


