import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class VirtualPetShelter2 {
	
	Map<String, VirtualPet2> allPets = new HashMap<>();
	
	public Collection<VirtualPet2> getAllPets() {
		return allPets.values();
	}
	
	public VirtualPet2 getPetName(String petName) {
		return allPets.get(petName);
	}
	
	
	public String listNamesAndDescriptions() {
		String namesAndDescriptions = "";
		for (VirtualPet2 pet : getAllPets()) {
			namesAndDescriptions += "\t" + pet.getPetName() + ": " + pet.getDescription() + "\n";
		}
		return namesAndDescriptions;
	}
	
	public void displayStatus() {
		for (VirtualPet2 pet : allPets.values()) {
			pet.getStatus();
			if (pet instanceof OrganicDog) {
				System.out.println(
						"    Cage Grossness:" + ((OrganicDog) pet).getCageGrossness());
			}
			if (pet instanceof OrganicCat) {
				System.out.println("    Litter Grossness: " + pet.litter);
			}
			if (pet instanceof RobotDog) {
				System.out.println("    Need for oil: " + pet.getOil() + " | Needs maintenance: " + pet.maintenance);
			}
			if (pet instanceof RobotCat) {
				System.out.println("    Need for oil: " + pet.getOil() + " | Needs maintenance: " + pet.maintenance);
			}
		}
	}
	
	public int getPetNumber() {
		return allPets.size();
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
	
	public void playWithOnePet(String petName) {
		allPets.get(petName).playWithPet();
	}
	
	public void feedPets() {
		for (VirtualPet2 pet : allPets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).feedPet();
			}
		}
	}
	public void waterPets() {
		for (VirtualPet2 pet : allPets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).waterPet();
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
	
	public void maintainRobots() {
		for (VirtualPet2 pet : allPets.values()) {
			if (pet instanceof RobotPet) {
				pet.maintainRobot();
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
				((RobotPet) pet).oilRobot();
			}
		}
	}
	
	public void tickAllPets() {
		for (VirtualPet2 pet : allPets.values()) {
			pet.singleTick();
			if (pet instanceof OrganicDog) {
				if (pet.needToUseIt >= 30) {
					((OrganicDog) pet).dirtyCage();
				}
			}
			if (pet instanceof OrganicCat) {
				if (pet.needToUseIt >= 10) {
					((OrganicCat) pet).dirtyLitter();
					pet.needToUseIt = 0;
				}
			}
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).organicTick();
			} else if (pet instanceof RobotPet) {
				((RobotPet) pet).RobotTick();
			}
		}
	}
}