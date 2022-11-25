package briefsHotel;

public class Chambre {

	private int categorie;
	private int capacite;
	
	//constructeur
	public Chambre(int categorie,int capacite) {
		this.categorie = categorie;
		this.capacite = capacite;
	}
	
	public int prix() {
		
		int[][] tabprix = {
	            {100, 120, 130 ,150,0,0},
	            {130,160,170,150,0,0},
	            {170,200,210,230,270,350},
	            {200,230,240,260,300,400}
	    };
		
		
		
		return tabprix[this.capacite-1][this.categorie-1];
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
	
	
	
}
