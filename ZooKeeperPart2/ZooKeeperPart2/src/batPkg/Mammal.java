package batPkg;

public class Mammal {
	protected int energyLevel = 300;
	
	public int displayEnergy() {
		
		System.out.println("Energy Level: " + energyLevel);
		return energyLevel;
	}
	public Mammal(int energyLevel) {
		this.energyLevel = (300);
	}
}
