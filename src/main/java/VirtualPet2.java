
public abstract class VirtualPet2 {
	protected String petName;
	protected String description;
	protected int health;
	protected int happiness;
	protected int hunger;
	protected int thirst;
	protected int needToUseIt;
	protected int oil;
	protected int maintenance;
	protected int litter;
	
	public VirtualPet2(String petName, String description, int health, int happiness) {
		this.petName = petName;
		this.description = description;
		this.health = health;
		this.happiness = happiness;
	}
	
	
	public VirtualPet2(String petName, String description) {
		this.petName = petName;
		this.description = description;
	}
	
	public int getHunger() {
		return hunger;
	}
	
	public int getThirst() {
		return thirst;
	}
	
	public int needToUseIt() {
		return needToUseIt;
	}
	
	public int getOil() {
		return oil;
	}

	public int getMaintenance() {
		return maintenance;
	}

	public int getLitter() {
		return litter;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getHappiness() {
		return happiness;
	}
	
	public void getStatus() {
		System.out.println("  " + petName + ": " + description + "\n    Health: " + health + " | Happiness: "
				+ happiness + "\n    Hunger: " + hunger + " | Thirst: " + thirst + " | Needs to Use It: "
				+ needToUseIt);
	}
	
	public int feedPet() {
		hunger = 0;
		return hunger;
	}

	public int waterPet() {
		thirst = 0;
		return thirst;

	}
	
	public int playWithPet() {
		happiness += 5;
		return happiness;
	}
	
	public void singleTick() {
		happiness -= 1;
		health -= 1;
		litter += 1;
	}

	public void oilRobot() {
		oil = 0;
		happiness += 5;
		health += 5;
	}

	public void maintainRobot() {
		maintenance = 0;
	}
}



	


	



