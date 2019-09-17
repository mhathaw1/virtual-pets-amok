import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicPetsTest {
	
	OrganicPet pet = new OrganicPet("Zinger", "", 15, 10, 10);
	
	
	@Test
	public void shouldBeAbleToFeedPets() {
		pet.feed();
		assertEquals(10, pet.getHunger());
	}
	
	@Test
	public void shouldBeAbleToWaterPets() {
		pet.water();
		assertEquals(5, pet.getThirst());
	}
	
	@Test
	public void shouldReturnPetName() {
		String testName = pet.getPetName();
		assertEquals(testName, "Zinger");
	}
	
	
	
	
	
	
}
