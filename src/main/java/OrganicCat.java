
public class OrganicCat extends OrganicPet implements CleanLitter{
	
	public OrganicCat(String petName, String description, int health, int happiness, int hunger, int thirst, int needToUseIt) {
		super(petName, description, health, happiness, hunger, thirst, needToUseIt);
	}
	
	public OrganicCat(String petName, String description) {
		super(petName, description);
	}
	
	
	@Override
	public int getLitter() {
		return litter;
	}
	
	@Override
	public void cleanLitter() {
		litter -= 5;
	}

	public void dirtyLitter() {
		litter += 1;
	}
}

