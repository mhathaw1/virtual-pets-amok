
public abstract class OrganicPet extends VirtualPet2 {

	public OrganicPet(String petName, String description, int health, int happiness, int hunger, int thirst, int needToUseIt) {
		super(petName, description, health, happiness);
	}
	
	public OrganicPet(String petName, String description) {
		super (petName, description);
	}
	
	public String getPetName() {
		return petName;
	}

	public int getHealth() {
		return health;
	}
	
	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public void organicTick() {
		hunger += 1;
		thirst += 1;
		needToUseIt += 1;
	}

}


