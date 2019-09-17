
public class OrganicDog extends OrganicPet implements WalkDog{
	
	private int cageGrossness;
	private int energy;

	public OrganicDog(String petName, String description) {
		super(petName, description);
	}
	
	public OrganicDog(String petName, String description, int petHealth, int hunger, int thirst, int cageGrossness, int energy) {
		super(petName, description, petHealth, hunger, thirst);
		this.cageGrossness = 10;
		this.energy = 10;
	}

	public int getCageGrossness() {
		return cageGrossness;
	}

	public void cleanCage() {
		cageGrossness -= 5;
	}

	@Override
	public void walkDog() {
		energy -= 5;
	}

	public int getEnergy() {
		return energy;
	}

}
