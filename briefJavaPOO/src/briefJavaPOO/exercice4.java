package briefJavaPOO;
import java.util.Scanner;
public class exercice4 {

	public static void main(String[] args) {
		//demander a l'utilisateur de saisir les infos
		Scanner scan = new Scanner(System.in);
		System.out.println("entrez votre nom");
		String nom = scan.next();
		System.out.println("entrez votre prenom");
		String prenom = scan.next();
		System.out.println("entrez votre age");
		int age = scan.nextInt();
		
		
		Contact perso = new Contact(nom , prenom , age);
		
		perso.infos();
		perso.initiales();
		perso.trigramme();
		
		scan.close();
}
}
