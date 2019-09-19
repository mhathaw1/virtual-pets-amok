
public class RobotPet extends VirtualPet2 {
		
	public RobotPet(String petName, String description, int health, int happiness, int oil, int maintenance) {
		super(petName, description, health, happiness);
		this.oil = oil;
		this.maintenance = maintenance;
	}
	
	public RobotPet(String petName, String description) {
		super(petName, description);
	}

	public int getOil() {
		return oil;
	}
	
	public int getMaintenance() {
		return maintenance;
	}

	public void RobotTick() {
		oil += 1;
		maintenance += 1;
	}

}


