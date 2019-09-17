import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RobotPetsTest {

	RobotPet robotPet = new RobotPet("BMO", "friendly", 10, 10);
	
	@Test
	public void shouldBeAbleToOilPet() {
		int oilLevelBeforeOiling = robotPet.getOil();
		robotPet.oilPet();
		int oilLevelAfterOiling = robotPet.getOil();
		assertEquals((oilLevelBeforeOiling + oilLevelAfterOiling), 15);
	}
	
	
}
