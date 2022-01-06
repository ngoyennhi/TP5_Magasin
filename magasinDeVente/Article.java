package magasinDeVente;

import java.util.Scanner;

public class Article {


//la reference 
private String reference;
//la designation
private String designation;
//le prix
private float prix;
//Declarer src pour input quand on saisi par le clavier
Scanner src = new Scanner(System.in);

//Getter & Setter
    public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public float getPrix() {
		return prix;
	}


	public void setPrix(float prix) {
		this.prix = prix;
	}	


	/**
	 * Attribute de l'Article
	 */
// la contruction - les attributes de l'objet par defaults
public  Article() {
	// les valuers par default
	reference = "toto";
	designation = "tata";
    prix = 12.5f; //Si vous voulez creer un float, vous devez terminer votre num�ro par f (c'est-�-dire: 3.6f).
}

// la contruction - les attributes de l'objet par paramettres

public  Article(String reference, String designation, float prix) {
setReference(reference);
setDesignation(designation);
setPrix(prix);
}

/**
 * Les methodes
 */

public void affichage() {
	System.out.println("Sa reference: " + getReference());
	System.out.println("Sa designation: " + getDesignation());
	System.out.println("Son prix: " + getPrix());
};

}
