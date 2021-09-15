package Interview.DemoProjectNirmalenduDas;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.ProfilePage;
import resources.Base;

public class ValidateVisibeUserName extends Base {

		@Test
		public void validateVisibleUsername()
		{
			ProfilePage pp = new ProfilePage(driver);
			Assert.assertEquals(pp.getVisibleusername().getText(), VisibleUserName);
			log.info("Visible Username successfully validated");
			System.out.println(pp.getLabelText().getText());
		}
}
