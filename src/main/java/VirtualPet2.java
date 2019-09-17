
public class VirtualPet2 {
	
	protected String petName;
	protected String description;
	protected int petHealth;

	public VirtualPet2(String petName, String description, int petHealth) {
		this.petName = petName;
		this.description = description;
		this.petHealth = petHealth;
	}
	
	public VirtualPet2(String petName, String description) {
		this.petName = petName;
		this.description = description;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public String getPetDescription() {
		return description;
	}
	
	public int getPetHealth() {
		return petHealth;
	}
	
	
}


