
public class OrganicCat extends OrganicPet implements CleanLitter{

	private int litter;
	
	public OrganicCat(String petName, String description) {
		super(petName, description);
	}
	
	public OrganicCat(String petName, String description, int petHealth, int hunger, int thirst, int litter) {
		super(petName, description, petHealth, hunger, thirst);
		this.litter = 10;
	}
	
	@Override
	public int getLitter() {
		return litter;
	}
	
	@Override
	public void cleanLitter() {
		litter -= 5;
	}


}
