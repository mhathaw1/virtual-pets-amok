
public class RobotDog extends RobotPet implements WalkDog{
	
	private int energy;

	public RobotDog(String petName, String description, int petHealth, int oil, int energy) {
		super(petName, description, petHealth, oil);
		this.energy = 10;
		
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
