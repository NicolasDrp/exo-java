package livre;

public class Livre {

	String auteur;
	String titre;
	String editeur;
	int prix;
	
	public Livre(final String auteur,final String titre,final String editeur,final int prix) {
		this.auteur = auteur;
		this.titre = titre;
		this.editeur = editeur;
		this.prix = prix;
	}
	
	public String info() {
		return "C'est un livre écris par "+this.auteur+" il s'intitule "+this.titre+" et est édité par "+editeur+". Il vous sera demander une caution de "+this.prix+"euros";
	}
	
	
	
	
	
	
	//getter setter
	public String getauteur() {
		return this.auteur;
	}
	
	public String gettitre() { 
		return this.titre;
	}
	
	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getEditeur() {
		return editeur;
	}


	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}


	public int getPrix() {
		return prix;
	}


	public void setPrix(int prix) {
		this.prix = prix;
	}


	public String getediteur() {
		return this.editeur;
	}
	public int prix() {
		return this.prix;
	}
	
}
