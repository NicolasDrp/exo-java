package briefsHotel;

public class Options {

	private int categorie;
	private int capacite;
	private String cat1 = "Lavabo";
	private String cat2 = "WC , Télévision";
	private String cat3 = "Cabine Douche,Télévision";
	private String cat4 = "WC, Cabine Douche,Télévision";
	private String cat5 = "SC,Salle de bain+Douche,Télévision";
	private String cat6 = "2 pièces, Salle de bain+douche,WC,Télévision";
	
	
	//constructeur
	public Options(int categorie ,int capacite) {
		this.categorie = categorie;
		this.capacite =capacite;
	}
	
	//getter setter
	public int getCategorie() {
		return categorie;
	}

	public void setCategorie(int categorie) {
		this.categorie = categorie;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public String getCat1() {
		return cat1;
	}

	public void setCat1(String cat1) {
		this.cat1 = cat1;
	}

	public String getCat2() {
		return cat2;
	}

	public void setCat2(String cat2) {
		this.cat2 = cat2;
	}

	public String getCat3() {
		return cat3;
	}

	public void setCat3(String cat3) {
		this.cat3 = cat3;
	}

	public String getCat4() {
		return cat4;
	}

	public void setCat4(String cat4) {
		this.cat4 = cat4;
	}

	public String getCat5() {
		return cat5;
	}

	public void setCat5(String cat5) {
		this.cat5 = cat5;
	}

	public String getCat6() {
		return cat6;
	}

	public void setCat6(String cat6) {
		this.cat6 = cat6;
	}

	//méthode
	public void optionsliste(){
		
		if(this.capacite == 1 || this.capacite ==2) {
		System.out.println("les chambre de catégorie 1 "+"sont équipé de "+this.cat1);
		System.out.println("les chambre de catégorie 2 "+"sont équipé de "+this.cat2);
		System.out.println("les chambre de catégorie 3 "+"sont équipé de "+this.cat3);
		System.out.println("les chambre de catégorie 4 "+"sont équipé de "+this.cat4);
			
	}
	else{
		System.out.println("les chambre de catégorie 1 "+"sont équipé de "+this.cat1);
		System.out.println("les chambre de catégorie 2 "+"sont équipé de "+this.cat2);
		System.out.println("les chambre de catégorie 3 "+"sont équipé de "+this.cat3);
		System.out.println("les chambre de catégorie 4 "+"sont équipé de "+this.cat4);
		System.out.println("les chambre de catégorie 5 "+"sont équipé de "+this.cat5);
		System.out.println("les chambre de catégorie 6 "+"sont équipé de "+this.cat6);
		
	}
	}
	
	
	//méthode
	public String choix() {
		if(this.categorie==1) {
			return "votre chambre est équipé de :"+this.cat1;
		}
		if(this.categorie==2) {
			return "votre chambre est équipé de :"+this.cat2;
		}
		if(this.categorie==3) {
			return "votre chambre est équipé de :"+this.cat3;
		}
		if(this.categorie==4) {
			return "votre chambre est équipé de :"+this.cat4;
		}
		if(this.categorie==5) {
			return "votre chambre est équipé de :"+this.cat5;
		}
		if(this.categorie==6) {
			return "votre chambre est équipé de :"+this.cat6;
		}
		return "erreur";
		
	}
	 
	
}
