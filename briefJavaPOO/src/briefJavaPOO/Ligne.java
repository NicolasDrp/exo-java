package briefJavaPOO;

public class Ligne {

	private String intitule;
	private double montant;
	
	public Ligne(String intitule,double montant) {
		this.intitule = intitule ;
		this.montant = montant;
		
	}

	
	public void intitule(){
		if(this.montant<0) {
			System.out.println("c'est un débit de "+this.montant+" euros intitulé :"+intitule);
		}
		else {
			System.out.println("c'est une recette de "+this.montant+" euros intitulé :"+intitule);
		}
		
	}


	public String getIntitule() {
		return intitule;
	}


	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}


	public double getMontant() {
		return montant;
	}


	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	
}
