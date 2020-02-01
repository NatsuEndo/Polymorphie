package main;

public class Pikachu extends ElectroType {

	private String name = Pikachu.class.getSimpleName();
	
	//polymorphism
	public void attack() {
		super.attack("thunder");
	}
	
	
	//Overloading a function 
	public void attack(String attack) {
		System.out.println(name + " attacks with " + attack + "!");
	}
}
