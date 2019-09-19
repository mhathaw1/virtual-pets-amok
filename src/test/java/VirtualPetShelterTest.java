import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

import virtualPetShelter.VirtualPet;

public class VirtualPetShelterTest {

	VirtualPetShelter2 testMenagerie = new VirtualPetShelter2();
	
	@Test
	public void shouldBeAbleToAddPet() {
		VirtualPet2 pet = new VirtualPet2("Name1", "Description1");
		testMenagerie.admitPet(pet);
		Collection<VirtualPet2> check = testMenagerie.getAllPets();
		assertThat(check, contains(pet));
	}
	
	
	@Test
	public void shouldBeAbleToAddMultipleOrganicDogs() {
		VirtualPet2 pet = new RobotCat("Name1", "Description1");
		testMenagerie.admitPet(pet);
		VirtualPet2 pet2 = new RobotCat("Name2", "Description2");
		testMenagerie.admitPet(pet2);
		Collection<VirtualPet2> check = testMenagerie.getAllPets();
		assertThat(check, containsInAnyOrder(pet, pet2));
		
		
	}
}


//@Test
//public void shouldBeAbleToAddTwoDifferentKindsOfBabies() {
//	HumanBaby human =new HumanBaby("1", "","");
//	RobotHumanBaby robot =new RobotHumanBaby ("2","","");
//	orphanage.addBaby(human);
//	orphanage.addBaby(robot);
//	Collection<VirtualBabies> check =orphanage.getAllBabies();
//	assertThat(check, containsInAnyOrder(human,robot));
//}