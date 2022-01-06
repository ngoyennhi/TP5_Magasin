package magasinDeVente;

public class Livre extends Article {
	
private int nISBN;
private int nombrePages;

//declarer ecrivain comme une nouvelle personne ( qui a le nom, prenom et la date de naissance )
private Personne ecrivain=new Personne();

//Getter & Setter
public int getnISBN() {
	return nISBN;
}
public void setnISBN(int nISBN) {
	this.nISBN = nISBN;
}
public int getNombrePages() {
	return nombrePages;
}
public void setNombrePages(int nombrePages) {
	this.nombrePages = nombrePages;
}
public Personne getEcrivain() {
	return ecrivain;
}
public void setEcrivain(Personne ecrivain) {
	this.ecrivain = ecrivain;
}


	
/**
 * Attribute de Livre
 */

//La contruction défault
public Livre() {
super();//appel au constructeur pas de Articles
	 nISBN = 123546;
nombrePages = 1235;
ecrivain = new Personne(); 
	
}

//La contruction avec les paramettres
public Livre(String reference, String designation, float prix ,int nISBN,int nombrePages) {

setReference(reference);
setDesignation(designation);
setPrix(prix);
setnISBN(nISBN);
setNombrePages(nombrePages);
}


/**
 * Les méthodes
 */

public void affichage() {
	super.affichage();
	System.out.println("Son numéro ISBN: " + getnISBN());
	System.out.println("Son numéro de pages: " + getNombrePages());
	System.out.println("Nom de l'auteur: " + this.ecrivain.getNom()); // get ecrivain et get son Nom
	System.out.println("Prenom de l'auteur: " + this.ecrivain.getPrenom()); // get ecrivain et get son preNom
	
	//pour affichage la date de naissance de écrivain au cas où.
//	this.ecrivain.affichage();
//	System.out.println("Jour : "+this.ecrivain.getDateDateNaissance().get(Calendar.DAY_OF_MONTH));
};



}
