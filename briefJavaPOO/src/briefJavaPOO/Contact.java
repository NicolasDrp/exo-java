package briefJavaPOO;

public class Contact {

	 private String nom;
	 private String prenom;
	 private int age;
	
	public Contact(String nom,String prenom,int age) {
		this.nom = nom ;
		this.prenom = prenom;
		this.age = age;
	}
	
	public void initiales() {
		String initiales = "";
		//prend la premiere lettre du prenom
		char c = this.prenom.charAt(0);
		c = Character.toUpperCase(c);
		initiales = initiales + c;
		//prend la premiere lettre du nom
		c = this.nom.charAt(0);
		c = Character.toUpperCase(c);
		initiales = initiales + c;
		
		System.out.println(initiales);
		
	}
	
	public void trigramme() {
		String trigramme = "";
		//prend la premiere lettre du prenom
		char c = this.prenom.charAt(0);
		c = Character.toUpperCase(c);
		trigramme = trigramme + c;
		//prend la premiere lettre du nom
		c = this.nom.charAt(0);
		c = Character.toUpperCase(c);
		trigramme = trigramme + c;
		//prend la derniere lettre du nom
	
		int derniere = this.nom.length() - 1;
		c = this.nom.charAt(derniere);
		c = Character.toUpperCase(c);
		trigramme = trigramme + c;
		
		System.out.println(trigramme);
		
	}
	
	public void infos() {
		System.out.println("nom :"+this.nom);
		System.out.println("prenom :"+this.prenom);
		System.out.println("age :"+this.age +" ans");
	}
		
}
