package briefJavaPOO;
import java.util.Scanner;

public class exercice2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("entrer une phrase");
		String text = scan.nextLine();
		
		//mettre le text en minuscule
		text = text.toLowerCase();
		//creation d'une chaine de caractere pour afficher le texte final 
		String textchanger = "";
		//mettre le premier caractere en majuscule et l'ajouter a notre chaine
		char c = text.charAt(0);
    	c = Character.toUpperCase(c);
 	   	textchanger =textchanger + c;
        for(int i = 1; i < text.length(); i++) {
     	   c = text.charAt(i);
           // si il y a un espace , on le rajoute a la chaine et on met le prochain caractere en maj
           if(c == ' ') {
        	   textchanger =textchanger + c;
        	   i++;
        	   c = text.charAt(i);
        	   c = Character.toUpperCase(c);
        	   textchanger =textchanger + c;  
        	   
           }
        // si il y a pas d'espace , on ajoute le caractere a la chaine
           else if(c!=' '){
        	   c = text.charAt(i);
        	   textchanger =textchanger + c;
           }
        }
        System.out.println(textchanger);
        scan.close();
	}
}
