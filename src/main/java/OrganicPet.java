
public abstract class OrganicPet extends VirtualPet2 {

	private String petName;
	private int health;
	private int hunger;
	private int thirst;

	public OrganicPet(String petName, String description, int petHealth, int hunger, int thirst) {
		super(petName, description);
		this.petHealth = 10;
		this.hunger = 10;
		this.thirst = 10;
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
	
	public Object getHunger() {
		return hunger;
	}

	public Object getThirst() {
		return thirst;
	}

	public void feed() {
		hunger -= 5;
	}
	
	public void water() {
		thirst -= 5;
	}


}
