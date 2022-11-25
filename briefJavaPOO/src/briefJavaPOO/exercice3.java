package briefJavaPOO;

import java.util.Scanner;

public class exercice3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("entrer une phrase");
		String text = scan.nextLine();
		//creation d'une chaine de caractere pour afficher le texte final
		String textchanger = "";
        for(int i = 0; i < text.length(); i++) {
     	   char c = text.charAt(i);
     	   //changer les e en 3
           if(c == 'e') {
        	   textchanger =textchanger + "3";       	   
           }//changer les o en 0
           else if(c=='o'){
        	   textchanger =textchanger + "0";
           }
        else {
        	textchanger =textchanger + c;
        }
        }
        System.out.println(textchanger);
        scan.close();
		
		
	}

}
