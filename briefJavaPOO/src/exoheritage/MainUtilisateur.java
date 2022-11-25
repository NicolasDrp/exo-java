package exoheritage;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainUtilisateur {

	public static void main(String[] args) {
		
//		Utilisateur utilisateur = new Utilisateur("Drapier", "Nicolas", "13/07/2001", "drapier.nicolas@gmail.com", "NicolasDrp", "motdepasse");
		
		Scanner scan = new Scanner(System.in);
		String etat = " ";
		ArrayList<Utilisateur> listeUtilisateur = new ArrayList<>();
		int i = 0;
		
		while (!etat.equals("stop")) {
			System.out.println("etat");
			etat = scan.nextLine();
			if (etat.equals("stop")) {
				break;
			}
			
			System.out.println(i++);
			System.out.println("coucou");
			String nom = scan.nextLine();
			String prenom = scan.nextLine();
			String date = scan.nextLine();
			String email = scan.nextLine();
			String login = scan.nextLine();
			String motdepasse = scan.nextLine();
			
			listeUtilisateur.add(new Utilisateur(nom, prenom, date, email, login, motdepasse));
				
		}
		for (int j= 0;j<listeUtilisateur.size();j++) {
			System.out.println(listeUtilisateur.get(j).getNom());
		}
		
		
		
		
		
		
		
		
		FileWriter fichier = null;
		file = new FileWriter("Book.csv");
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * Connexion exercice 2

		System.out.println("entrez votre nom d'utilisateur");
		String login = scan.nextLine();
		System.out.println("entrez votre mot de passe");
		String motdepasse = scan.nextLine();

		
		
		System.out.println(connection.connection(login, motdepasse));
		*/
		
		scan.close();
	}

}
