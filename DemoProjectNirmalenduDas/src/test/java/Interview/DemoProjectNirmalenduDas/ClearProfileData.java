package Interview.DemoProjectNirmalenduDas;

import org.testng.annotations.Test;

import pageObjects.ProfilePage;
import resources.Base;

public class ClearProfileData extends Base {

	@Test
	public void clearAllProfileData() {
		
		ProfilePage pp = new ProfilePage(driver);
		pp.getFirstname().clear();
		pp.getLastName().clear();
		pp.getAboutme().clear();
	}
}
