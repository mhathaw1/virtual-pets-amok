import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

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
		VirtualPet2 organicDog1 = new OrganicDog("Name1", "Description1");
		VirtualPet2 organicDog2 = new OrganicDog("Name2", "Description2");
		testMenagerie.admitPet(organicDog1);
		testMenagerie.admitPet(organicDog2);
		Collection<VirtualPet2> check = testMenagerie.getAllPets();
		assertThat(check, contains(organicDog1, organicDog2));
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