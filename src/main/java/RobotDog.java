
public class RobotDog extends RobotPet{
	
	private int energy;

	public RobotDog(String petName, String description, int health, int happiness, int oil, int maintenance) {
		super(petName, description, health, happiness, oil, maintenance);
		
	}
	public RobotDog(String petName, String description) {
		super(petName, description);
	}
	
	public int getEnergy() {
		return energy;
	}

	@Override
	public void walkDog() {
		this.energy -= 5;
	}
	
}
