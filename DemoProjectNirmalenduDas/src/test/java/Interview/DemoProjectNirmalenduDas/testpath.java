package Interview.DemoProjectNirmalenduDas;

import org.testng.annotations.Test;

import pageObjects.ProfilePage;
import resources.Base;

public class testpath extends Base {

	@Test
	public static void testmethod() {
		// TODO Auto-generated method stub
		ProfilePage pp = new ProfilePage(driver);
    	pp.AddLinkButton().click();
    	pp.addUrlButton().click();
	}

}
