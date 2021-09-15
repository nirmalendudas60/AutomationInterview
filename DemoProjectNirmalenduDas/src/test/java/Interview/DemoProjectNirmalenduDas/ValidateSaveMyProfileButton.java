package Interview.DemoProjectNirmalenduDas;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pageObjects.ProfilePage;
import resources.Base;

public class ValidateSaveMyProfileButton extends Base {
	
	@Test
	public void validateSaveMyProfileButtonDisablity()
	{
		ProfilePage pp = new ProfilePage(driver);
		if(pp.getFirstname().getAttribute("value").isEmpty() && pp.getLastName().getAttribute("value").isEmpty() && pp.getAboutme().getAttribute("value").isEmpty())	
		{
			assertFalse(pp.getProfileButton().isEnabled());
			log.info("Save Profile button will be disabled if First name, last name and description field is empty");
		}
	
	}

	@Test(description= "To check the save my profile button enable if any of the field is non empty",groups= {"Smoke"})
	public void validateSaveMyProfileButtonEnableIfAnyFieldIsNonEmpty()
	{
		ProfilePage pp = new ProfilePage(driver);
		if(!pp.getFirstname().getAttribute("value").isEmpty() || !pp.getLastName().getAttribute("value").isEmpty() || !pp.getAboutme().getAttribute("value").isEmpty())	
		{
			assertTrue(pp.getProfileButton().isEnabled());
			log.info("Save Profile button will be disabled if First name, last name and description field is empty");
		}
	
	}
	

	
}
