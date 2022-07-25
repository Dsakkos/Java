package batPkg;

public class Bat extends Mammal {
	public Bat(int energyLevel) {
		super(energyLevel);
	}

	public void fly() {
		energyLevel -= 50;
		System.out.println("The Bat is Flying!! \n" + "Energy Level: " + energyLevel);
	}
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("The Bat Ate A HUMAN!! \n" + "Energy Level: " + energyLevel);
		
	}
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("The Town is Under Attack!! \n" + "Energy Level: " + energyLevel);	
	}
}


