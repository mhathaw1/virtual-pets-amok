import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class VirtualPetShelter2 {
	

	public Map<String, VirtualPet2> allPets = new HashMap<>();
	
	public Collection<VirtualPet2> getAllPets() {
		return allPets.values();
	}
	
	public VirtualPetShelter2() {
	}
	
	public VirtualPet2 getPetName(String petName) {
		return allPets.get(petName);
	}
	
	public VirtualPet2 getPetDescription(String description) {
		return allPets.get(description);
	}
	
	public void admitPet(VirtualPet2 pet) {
		allPets.put(pet.getPetName(), pet);
	}


	public void adoptPet(VirtualPet2 pet) {
		allPets.remove(pet.getPetName(), pet);
	}
	
	public void feedPets() {
		for (VirtualPet2 pet : allPets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).feed();
			}
		}
	}
	
	public void waterPets() {
		for (VirtualPet2 pet : allPets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).water();
			}
		}
	}
	
	public void cleanLitterBox() {
		for (VirtualPet2 pet : allPets.values()) {
			if (pet instanceof OrganicCat) {
				((OrganicCat) pet).cleanLitter();
			}
		}
	}


	public void walkDogs() {
		for (VirtualPet2 pet : allPets.values()) {
			if (pet instanceof OrganicDog) {
				((OrganicDog) pet).walkDog();
			} else if (pet instanceof RobotDog) {
				((RobotDog) pet).walkDog();
			}
		}
	}
	
	public void cleanCages() {
		for (VirtualPet2 pet : allPets.values()) {
			if (pet instanceof OrganicDog) {
				((OrganicDog) pet).cleanCage();
			}
		}
	}
	
	public void oilAllRobots() {
		for (VirtualPet2 pet : allPets.values()) {
			if (pet instanceof RobotPet) {
				((RobotPet) pet).oilPet();
			}
		}
	}
	
}
