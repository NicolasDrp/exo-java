package exoheritage;

public class MainAnimal {

	public static void main(String[] args) {

		Animal type = new Animal();
		
		
		System.out.println(type.toString());
		System.out.println(type.cri());
		
		
		Chien chien = new Chien();
		
		System.out.println(chien.toString());
		System.out.println(chien.aboie());
		System.out.println(chien.cri());
		
		Chat chat = new Chat();
		
		System.out.println(chat.toString());
		System.out.println(chat.miaule());
		System.out.println(chat.cri());
		
		
		
		
	}

}
