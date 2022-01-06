package magasinDeVente;


import java.util.Calendar;

import java.util.GregorianCalendar;

public class Personne {
// champs priv�s repr�sentant le nom et pr�nom
	private String nom;
	private String prenom;

//date de nassance
	
	private GregorianCalendar dateDateNaissance;
	GregorianCalendar dateDefault = new GregorianCalendar();
	 public GregorianCalendar getDateDateNaissance() {
		return dateDateNaissance;
	}
	public void setDateDateNaissance(GregorianCalendar dateDateNaissance) {
		this.dateDateNaissance = dateDateNaissance;
	}
	
	public String getNom() {
		return nom;
	}
	/**
	 * Stoke le nom en majuscule dans l'objet
	 * @param n
	 */
	public void setNom(String n) {
		nom = n.toUpperCase();
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * Stoke le pr�nom on minuscule
	 * @param p
	 */
	 public void setPrenom(String p) {
		 prenom = p.toLowerCase();
	 }
	 
 
	  /**
	   * Methode defini dans Personne
	   */
	 


public void saisieDateDeNaissance(int anneNaissance,int moiNaissance, int jourNaissance) {
		
		//le  mois de GregorianCalendar de 0 a 11 ==  du jan au dec, donc , input il faut moins 1 pour selectioner bon mois
		dateDateNaissance = new GregorianCalendar(anneNaissance, moiNaissance-1, jourNaissance);

}
	  //calcul l'age
	  public long calculAge() {
		return ( dateDefault.get(Calendar.YEAR) - dateDateNaissance.get(Calendar.YEAR));
			  }  
	  //afficher
	  public void affichage() {
		  System.out.println("nom " + nom);
		  System.out.println("prenom: " + prenom);
		 System.out.println("age : " + calculAge());  
		 System.out.println("Date de naissance: "+this.dateDateNaissance.get(Calendar.DAY_OF_MONTH) + " " +(this.dateDateNaissance.get(Calendar.MONTH)+1)+" " +this.dateDateNaissance.get(Calendar.YEAR));

	  }
}
