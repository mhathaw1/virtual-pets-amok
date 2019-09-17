
public class RobotPet extends VirtualPet2 {
	
	private String petName;
	
	protected int oil;

	public RobotPet(String petName, String description, int petHealth, int oil) {
		super(petName, description);
		this.oil = 10;
	}
	
	public RobotPet(String petName, String description) {
		super(petName, description);
	}

	public String getPetName() {
		return petName;
	}

	public int getHealth() {
		return petHealth;
	}

	public int getOil() {
		return oil;
	}

	public void oilPet() {
		oil -= 5;
		
	}

}
