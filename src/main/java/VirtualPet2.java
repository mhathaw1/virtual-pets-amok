
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
	protected int cageGrossness;
	protected int litter;
	
	
	public VirtualPet2(String petName, String description, int health, int happiness) {
		super();
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

	public int getCageGrossness() {
		return cageGrossness;
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
	
	
	public int playWithPet() {
		health += 5;
		happiness += 5;
		return happiness;
	}
	
	public void getStatus() {
		System.out.println("  " + petName + ", " + description + "\n    Health: " + health + " | Happiness: "
				+ happiness + "\n    Hunger: " + hunger + " | Thirst: " + thirst + " | Needs to Use It: "
				+ needToUseIt + "\n    Needs oil: " + oil + " | Needs maintenance: " + maintenance + "");
	}
	
	public int feedPet() {
		hunger = 0;
		return hunger;
	}

	public int waterPet() {
		thirst = 0;
		return thirst;

	}
	
	public void singleTick() {
		happiness -= 1;
		health -= 1;
		litter += 1;
		cageGrossness += 1;
	}

	public void oilRobot() {
		oil = 0;
		happiness += 2;
		health += 2;
	}

	public void maintainRobot() {
		maintenance = 0;
		happiness += 2;
		health += 2;
	}

	public void walk() {
		happiness += 2;
		health += 2;
		needToUseIt = 0;
	}

	public void cleanCage() {
		cageGrossness = 0;
		happiness += 2;
		health += 2;
	}
	
}



	


	



