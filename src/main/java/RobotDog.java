
public class RobotDog extends RobotPet implements WalkDog{

	public RobotDog(String petName, String description, int health, int happiness, int oil, int maintenance) {
		super(petName, description, health, happiness, oil, maintenance);
		
	}
	public RobotDog(String petName, String description) {
		super(petName, description);
	}

	@Override
	public void walkDog() {
		this.happiness += 5;
	}
	
}
