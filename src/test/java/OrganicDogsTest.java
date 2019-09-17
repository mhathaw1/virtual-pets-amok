import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrganicDogsTest {

	
	OrganicDog dog = new OrganicDog("Zingy", "", 10, 10, 10, 10, 10);
	
	@Test
	public void shouldReturnCageGrossness() {
		int cageGrossness = dog.getCageGrossness();
		assertEquals(cageGrossness, 10);
	}
	
	@Test
	public void shouldBeAbleToCleanCage() {
		dog.cleanCage();
		int cageGrossness = dog.getCageGrossness();
		assertEquals(cageGrossness, 5);
	}
	
	@Test
	public void shouldBeAbleToWalkDog() {
		dog.walkDog();
		int energy = dog.getEnergy();
		assertEquals(5, energy);
	}
	
	
}
