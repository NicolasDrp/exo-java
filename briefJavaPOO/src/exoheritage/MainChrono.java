package exoheritage;

public class MainChrono {

	public static void main(String[] args) {
		
		//creation objet
		Chronometre temps = new Chronometre(5234423151L);
		System.out.println(temps.date());
		temps.avancer(31453554);
		System.out.println(temps.date());
		
		
	
		
		
	}

}
