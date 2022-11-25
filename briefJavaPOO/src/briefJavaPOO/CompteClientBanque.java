package briefJavaPOO;
public class CompteClientBanque {

	private double solde;
	private Ligne ligne;
	
	
	public CompteClientBanque(double solde,Ligne ligne) {
		this.solde = solde;
		this.ligne = ligne;
		
	}
	
	public void moyenne() {
		
	}
	
	public void solde() {
		
	}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*int nombreligne ;
	
	public CompteClientBanque(int nombreligne) {
		this.nombreligne = nombreligne ;
	}
	
	
	public void lignecompte() {
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<=5;i++) {
			String intitule = scan.nextLine();
			int montant = scan.nextInt();
			
			Ligne compte = new Ligne(intitule, montant);
			compte.intitule();
		}
		
		scan.close();
	}*/
	
	
}
