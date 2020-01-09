package main;

public class Lucario extends Pokemon{

	String name = Lucario.class.getSimpleName();
	
	//polymorphism
	public void attack() {
		System.out.println(name + " attacks with copycat!");

	}
}
