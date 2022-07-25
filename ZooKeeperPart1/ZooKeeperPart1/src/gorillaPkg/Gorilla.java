package gorillaPkg;

public class Gorilla extends Mammal {
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	public void throwSomething() {
		System.out.println("The Gorilla Through Somthing!! \n" + "Energy Level: " + energyLevel);
		energyLevel -= 5;
	}
	public void eatBanana() {
		System.out.println("The Gorilla is eating banana \n" + "Energy Level: " + energyLevel);
		energyLevel += 10;
	}
	public void climb() {
		System.out.println("The Gorilla is climbing \n" + "Energy Level: " + energyLevel);
		energyLevel -= 10;
	}
}