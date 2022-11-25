package briefsHotel;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
			int categorie;
			int capacite;
			
			
			//demnader a l'utilisateur de choisir le nombre de personne pour la chambre
			Scanner scan = new Scanner(System.in);
			System.out.println("pour combien de personne souhaitez vous reserver");
			capacite = scan.nextInt();
			//forcer a choisir un nombre entre 1 et 4
			while(capacite >4 || capacite <1) {
				System.out.println("le nombre de personne autorisé est entre 1 et 4");
				capacite = scan.nextInt();
			}
			
			Options options = new Options(0,capacite);
			options.optionsliste();
			
			//si la capacité est égale a 2 ou 1 , ne pas autorise les chambre de catégorie 5 et 6
			if(capacite ==2 ||capacite ==1) {
				System.out.println("quel catégorie de chambre voulez-vous");
				categorie = scan.nextInt();
				while(categorie <1 || categorie >4) {
				System.out.println("les categories autorisé avec les chambre 1 et 2 place est entre 1 et 4");
				categorie = scan.nextInt();
				}
			}
				else {
					//juste demander quel catégorie ils veulent
					System.out.println("quel catégorie de chambre voulez-vous ");
					categorie = scan.nextInt();		
					//forcer a choisir un nombre entre 1 et 6
					while(categorie <1 || categorie >6) {
						System.out.println("le nombre de categorie autorisé est entre 1 et 6");
						categorie = scan.nextInt();
					}
				}
			
			
			
			
			Chambre chambre = new Chambre(categorie,capacite);
			
			int prix = chambre.prix();
			
			System.out.print("la chambre que vous avez choisis est disponible au prix de " +prix+ "euros, de plus ");
			
			// Class Options Constructeur Optionschoix
			Options choix = new Options(categorie ,capacite);
			
			String choixoptions = choix.choix();
			
			System.out.println(choixoptions);
			
			
			
			
			
			
			
			scan.close();
	
}
}
