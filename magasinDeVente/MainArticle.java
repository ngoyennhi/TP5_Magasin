package magasinDeVente;

public class MainArticle {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//ex1 Créer une classe représentant un article d’un magasin
//		
//Article newArticle1 = new Article();
//Article newArticle2 = new Article("125HADF","Scientifique",12.30f); //Si vous voulez créer un float, vous devez terminer votre numéro par f (c'est-à-dire: 3.6f).
//newArticle1.affichage();
//newArticle2.affichage();
//		
//		//ex2 Ajouter les deux classes Livre et Dvd héritant de la classe Article.
//Livre newLivre1 = new Livre();
//Livre newLivre2 = new Livre("125HADF","Scientifique",12.30f,1258645,123);
//newLivre1.affichage();
//newLivre2.affichage();

//ex3 déclarer directeur/auteur par classe Personne
Livre newLivre3 = new Livre();
newLivre3.getEcrivain().setNom("Sabine");// get Ecrivain entier et apès set son nom 
newLivre3.getEcrivain().setPrenom("Cun");
newLivre3.getEcrivain().saisieDateDeNaissance(1988, 12, 23);

newLivre3.getEcrivain().affichage(); // méthode affichage() de classe Personne
	}

}
