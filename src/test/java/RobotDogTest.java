import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RobotDogTest {

	RobotDog roboDog = new RobotDog("Robo", "", 10, 10, 10);
	
	@Test
	public void shouldBeAbleToWalk() {
		int energyBeforeWalking = roboDog.getEnergy();
		roboDog.walkDog();
		int energyAfterWalking = roboDog.getEnergy();
		assertEquals((energyBeforeWalking + energyAfterWalking), 15);
	}
	
}
