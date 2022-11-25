package briefJavaPOO;

public class exercice5 {

	/*
		//demander a l'utilisateur de saisir les infos
		Scanner scan = new Scanner(System.in);
		System.out.println("intitule");
		String intitule = scan.nextLine();
		System.out.println("montant");
		double montant = scan.nextDouble();
		
		Ligne infos = new Ligne(intitule,montant);
		
		infos.intitule();
				
		scan.close();
	}
	*/
	
	public static void main(String[] args) {
		Ligne ligne1 = new Ligne("virement JM DOUDOUX", 354);
		ligne1.intitule();
	}


}
	
