package Interview.DemoProjectNirmalenduDas;

import org.testng.annotations.Test;

import pageObjects.ProfilePage;
import resources.Base;

public class SaveProfileDetails extends Base {

	@Test
	public void SaveProfileDetailsByProvidingValidInfo() throws InterruptedException
	{
		ProfilePage pp = new ProfilePage(driver);
		if(pp.getFirstname().isDisplayed()) {
			log.info("First Name field exist");
			pp.getFirstname().sendKeys(FirstName);

		}else {
			log.info("First Name field is not displayed");
		}
		
		if(pp.getLastName().isDisplayed()) {
			log.info("LastName field is displayed");
			pp.getLastName().sendKeys(LastName);
		}else {
			log.info("Last Name field is not displayed");
		}
		
		if(pp.getAboutme().isDisplayed()) {
			log.info("About Me text field s displayed");
			pp.getAboutme().sendKeys(AboutMe);
		}else {
			log.info("About Me field is not displayed");
		}
		
		if(pp.getProfileButton().isEnabled()) {
			log.info("Save Profile button is enabled");
			pp.getProfileButton().click();
		}else {
			log.info("Profile button is still not enabled");
		}
		
		Thread.sleep(1000);
		if(pp.getSaveSuccessMessage().isDisplayed()) {
			log.info("Data saved successfully");
		}
	}
}
