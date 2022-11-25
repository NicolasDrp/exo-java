package briefJavaPOO;
import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		//demander a l'utilisateur de rentrer une chaine de caractere
        Scanner scan = new Scanner(System.in);
        System.out.println("entrer une phrase");
        String text = scan.nextLine();
        int na = 0;
        int ne = 0;
        int no = 0;
        //passer le text en minuscule
        text = text.toLowerCase();
        for(int i = 0; i < text.length(); i++) {
           char c = text.charAt(i); 
           if(c == 'a') { 
                na++;
           } else if(c =='e') {
                ne++;
           }else if(c =='o') {
        	   	no++;
           }
           
        }
        System.out.println("il y a :" + na +" a dans la phrase et :" + ne + "e dans la phrase , ainsi que :" + no + " o ");
		scan.close();
	}

}
