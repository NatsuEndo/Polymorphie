package main;

public class Main {

	public static void main(String[] args) {

		Pikachu pika = new Pikachu();
		Lucario lucario = new Lucario();
		
		System.out.println("Let the fight beginn!");
		
		pika.attack();
		
		System.out.println("Attack was very effectiv!");
		
		lucario.attack();
		
		System.out.println("Attack was not very effectiv!");
		
		pika.attack("agility");
		
		System.out.println("Fight is over! You won!");

	}

}
