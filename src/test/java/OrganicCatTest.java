import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrganicCatTest {
	OrganicCat cat = new OrganicCat("", "", 10, 10, 10, 10);
	
	@Test
	public void shouldBeAbleToCleanLitter() {
		int litterBeforeCleaning = cat.getLitter();
		cat.cleanLitter();
		int litterAfterCleaning = cat.getLitter();
		assertEquals((litterBeforeCleaning + litterAfterCleaning), 15);
	}
}

