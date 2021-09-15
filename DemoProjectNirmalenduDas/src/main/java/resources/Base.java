package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import pageObjects.LoginPage;
import pageObjects.ProfilePage;

public class Base {

	public static WebDriver driver;
	protected String url1;
	protected String url2;
	protected Properties prop;
	protected String username;
	protected String password;
	protected String VisibleUserName;
	protected String ToggleLabelText;
	protected String FirstName;
	protected String LastName;
	protected String AboutMe;
	protected String Headername;
	protected static Logger log = LogManager.getLogger(Base.class.getName());
	
public WebDriver intializedriver() throws IOException {
	prop = new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
		
		
		String browser = prop.getProperty("browser");
		url1 = prop.getProperty("url1");
		String chromePath = prop.getProperty("ChromePath");
		String ffpath = prop.getProperty("FirefoxPath");
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", chromePath);
			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("Firefox")){
			
			System.setProperty("webdriver.gecko.driver", ffpath);
			driver = new FirefoxDriver();
			
			
		}
		else if(browser.equalsIgnoreCase("IE")) {
			System.out.println("We are sorry");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}

@BeforeTest
public void initialize() throws IOException, InterruptedException {
	
	driver = intializedriver();
	driver.get(url1);
	driver.manage().window().maximize();
	log.info("Driver is initialized");
	VisibleUserName=prop.getProperty("VisibleUsername");
	ToggleLabelText=prop.getProperty("ToggleLabelText");
	username=prop.getProperty("UserName");
	password=prop.getProperty("Password");
	FirstName=prop.getProperty("FirstName");
	LastName=prop.getProperty("LastName");
	AboutMe=prop.getProperty("AboutMe");
	Headername=prop.getProperty("Headername");
	navigation();
}


public void killDriver() {
	ProfilePage pp = new ProfilePage(driver);
	clearAllProfileData();
	driver.quit();
}
public void navigation() throws IOException, InterruptedException {
	LoginPage lp = new LoginPage(driver);
	lp.getUsername().sendKeys(username);
	lp.getContinueButton().click();;
	lp.getPassword().sendKeys(password);
	lp.getLoginButton().click();;
	Thread.sleep(1000);
	
}

public void clearAllProfileData() {
	
	ProfilePage pp = new ProfilePage(driver);
	pp.getFirstname().sendKeys(Keys.CONTROL+"a");
	pp.getFirstname().sendKeys(Keys.DELETE);
	pp.getLastName().sendKeys(Keys.CONTROL+"a");
	pp.getLastName().sendKeys(Keys.DELETE);
	pp.getAboutme().sendKeys(Keys.CONTROL+"a");
	pp.getAboutme().sendKeys(Keys.DELETE);
	pp.getProfileButton().click();
}



public void clickCancelButton()
{
	ProfilePage pp = new ProfilePage(driver);
	pp.CancelButton().click();
}




}
	

