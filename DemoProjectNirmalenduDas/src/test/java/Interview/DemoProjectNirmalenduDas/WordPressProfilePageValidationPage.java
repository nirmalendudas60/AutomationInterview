package Interview.DemoProjectNirmalenduDas;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LoginPage;
import pageObjects.ProfilePage;
import resources.Base;


public class WordPressProfilePageValidationPage extends Base {



//String VisibleUserName = "nirmalenduautomation";
	
	
	@Test
	public void hideGravtarProfileLabelText()
	{
		ProfilePage pp = new ProfilePage(driver);
		//Assert.assertEquals(pp.getLabelText().getText(), ToggleLabelText);
		System.out.println(pp.getLabelText().getText());
		log.info("Hide my gravtar profile text is clearly visible");;
	}
	
	
	@Test
	public void validateSaveMyProfileButtonActive()
	{
		
	}
}

	
