
package stepDefinition;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.LoginPage;
import pageObjects.ProfilePage;
import resources.Base;

public class StepDefinition extends Base {

	 @Given("^Initialize the Chrome Browser and launch the \"([^\"]*)\"$")
	    public void initialize_the_chrome_browser_and_launch_the_url(String strArg1) throws Throwable {
		 driver = intializedriver();
			driver.get(strArg1);
			log.info("Driver is initialized");
	    }
	 @Given("^Navigate to WordPress Login Page$")
	    public void navigate_to_wordpress_login_page() throws Throwable {
		 driver.manage().window().maximize();
			log.info("User is o login page");
	    }
	 @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_something(String strArg2, String strArg3) throws Throwable {
		 LoginPage lp = new LoginPage(driver);
			lp.getUsername().sendKeys(strArg2);
			lp.getContinueButton().click();;
			lp.getPassword().sendKeys(strArg3);
			lp.getLoginButton().click();;
			Thread.sleep(1000);
	    }

	    @Then("^My Profile page is populated and \"([^\"]*)\" page header should be displayed$")
	    public void my_profile_page_is_populated_and_something_page_header_should_be_displayed(String strArg4) throws Throwable {
	    	ProfilePage pp = new ProfilePage(driver);
	    	Assert.assertEquals(pp.getHeadername().getText(), strArg4);
	    	log.info("Hide my profile text is clearly visible");
	    }

	    @Then("^Username \"([^\"]*)\" should be displayed at the My Profile Page$")
	    public void username_something_should_be_displayed_at_the_my_profile_page(String strArg5) throws Throwable {
	    	ProfilePage pp = new ProfilePage(driver);
	    	Assert.assertEquals(pp.getVisibleusername().getText(), strArg5);
	    	log.info("Visible Username successfully validated");
	    }
	    
	    @Given("^User is on My Profile page$")
	    public void user_is_on_my_profile_page() throws Throwable {
	    	ProfilePage pp = new ProfilePage(driver);
	    	Assert.assertEquals(pp.getVisibleusername().getText(), "nirmalenduautomation");
	    	log.info("User is on My Profile Profile Landing page");
	    }

	    @When("^Hide My Profile info toggle button is displayed$")
	    public void hide_my_profile_info_toggle_button_is_displayed() throws Throwable {
	    	ProfilePage pp = new ProfilePage(driver);
	    	if(pp.toggleButtonInput().isDisplayed())
	    	{
	    		log.info("Hide My Profile Details Toggle button exist in My Profile page");
	    	}
	    	else
	    	{
	    		log.fatal("Hide My Profile Details toggle button does not exist in My Prfile Page");
	    	}
	    }
	    
	    @Then("^Hide My profile info toggle buton should not be selected by default$")
	    public void hide_my_profile_info_toggle_buton_should_not_be_selected_by_default() throws Throwable {
	    	ProfilePage pp = new ProfilePage(driver);
	    	if(!pp.getToggleButtonStatus().contains("checked"))
	    	{
	    		log.info("Save My Profile Info Toggle button is by default unselected");
	    	}
	    	else
	    	{
	    		log.fatal("Save My Profile Info Toggle button is by default slected");
	    	}
	    }


	    @Given("^Navigate to My Profile Page and \"([^\"]*)\" page header is displayed$")
	    public void navigate_to_my_profile_page_and_something_page_header_is_displayed(String strArg6) throws Throwable {
	    	ProfilePage pp = new ProfilePage(driver);
	    	Assert.assertEquals(pp.getHeadername().getText(), strArg6);
	    	log.info("Hide my gravtar profile text is clearly visible");
	    }

	    @When("^First Name is \"([^\"]*)\", Last Name is \"([^\"]*)\" and About Me is \"([^\"]*)\"$")
	    public void first_name_is_something_last_name_is_something_and_about_me_is_something(String strArg7, String strArg8, String strArg9) throws Throwable {
	    	ProfilePage pp = new ProfilePage(driver);
	    	pp.getFirstname().sendKeys(strArg7);
	    	pp.getLastName().sendKeys(strArg8);
	    	pp.getAboutme().sendKeys(strArg9);
	    }

	   

	    
	    @Then("^Save My Profile Details button enabled is \"([^\"]*)\"$")
	    public void save_my_profile_details_button_enabled_is_something(String strArg11) throws Throwable {
	    	ProfilePage pp = new ProfilePage(driver);
	    	log.info("Profile displayed is "+strArg11);
	    	assertTrue(pp.getProfileButton().isEnabled());
	    }

	    @Then("^Clear all fields$")
	    public void clear_all_fields() throws Throwable {
	    	clearAllProfileData();
	    }

	    @Given("^Fill First Name as \"([^\"]*)\" and Last name as \"([^\"]*)\" and AbountMe as \"([^\"]*)\"$")
	    public void fill_first_name_as_something_and_last_name_as_something_and_abountme_as_something(String strArg12, String strArg13, String strArg14) throws Throwable {
	    	ProfilePage pp = new ProfilePage(driver);
	    	pp.getFirstname().sendKeys(strArg12);
	    	pp.getLastName().sendKeys(strArg13);
	    	pp.getAboutme().sendKeys(strArg14);

	    }
	    
	    @When("^User clicks on Save button, Save success message should be displayed$")
	    public void user_clicks_on_save_button_save_success_message_should_be_displayed() throws Throwable {
	    	ProfilePage pp = new ProfilePage(driver);
	    	pp.getProfileButton().click();
	    	if(pp.getSaveSuccessMessage().isDisplayed())
	    	{
	    		log.info("User is able to save profile information successfully");
	    	}
	    	else
	    	{
	    		log.fatal("No save success message is dispayed");
	    	}
	    }
	    
	  

	    @Then("^User logs out of the application and close the browser$")
	    public void user_logs_out_of_the_application_and_close_the_browser() throws Throwable {
	    	ProfilePage pp = new ProfilePage(driver);
	    	pp.getLogOutbutton().click();
	    	killDriver();
	    }
  
}