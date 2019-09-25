
public class OrganicDog extends OrganicPet implements WalkDog{
	
	private int cageGrossness;

	public OrganicDog(String petName, String description, int health, int happiness, int hunger, int thirst, int needToUseIt, int cageGrossness) {
		super(petName, description, health, hunger, thirst, needToUseIt, cageGrossness);
	}
	public OrganicDog(String petName, String description) {
		super(petName, description);
	}
	

	public int getCageGrossness() {
		return cageGrossness;
	}

	public void cleanCage() {
		cageGrossness = 0;
	}

	public void dirtyCage() {
		cageGrossness += 1;
	}
	
	@Override
	public void walkDog() {
	happiness += 5;
	needToUseIt = 0;
	}
	@Override
	public void singleTick() {
		happiness -= 1;
		health -= 1;
		litter += 1;
		cageGrossness += 1;
	}
}
