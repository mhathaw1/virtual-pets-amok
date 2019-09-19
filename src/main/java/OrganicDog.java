
public class OrganicDog extends OrganicPet{
	
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
		cageGrossness -= 5;
	}

	public void dirtyCage() {
		cageGrossness += 1;
	}
	
	@Override
	public void walkDog() {
	happiness += 5;
	needToUseIt = 0;
	}
}
