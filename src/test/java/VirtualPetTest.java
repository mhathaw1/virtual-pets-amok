import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {

	VirtualPet2 underTest = new VirtualPet2("Steve", "Nice", 10);
	
	@Test
	public void shouldBeAbleToGetName() {
		String name = underTest.getPetName();
		assertEquals("Steve", name);
	}
	
	@Test
	public void shouldBeAbleToGetDescription() {
		String description = underTest.getPetDescription();
		assertEquals("Nice", description);
	}
	
}
