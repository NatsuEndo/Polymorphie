package main;

public class Pikachu extends Pokemon {

	private String name = Pikachu.class.getSimpleName();
	
	//polymorphism
	public void attack() {
		System.out.println(name + " attacks with thunder shock!");
	}
	
	
	//Overloading a function 
	public void attack(String attack) {
		System.out.println(name + " attacks with " + attack + "!");
	}
}
