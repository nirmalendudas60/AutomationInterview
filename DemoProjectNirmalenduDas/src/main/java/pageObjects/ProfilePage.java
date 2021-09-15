package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {
	WebDriver driver;
	By headername=By.xpath("//*[@class='profile main']/header/h1");
	By visibleusername=By.xpath("//div[@class='profile-gravatar is-in-sidebar']/h2");
	By firstname=By.xpath("//input[@id='first_name']");
	By lastname=By.xpath("//input[@id='last_name']");
	By displayname=By.xpath("//input[@id='display_name']");
	By aboutme=By.xpath("//textarea[@id='description']");
	By hideprofiletoggle=By.xpath("//span[@class='components-form-toggle']/input");
	By labeltext=By.xpath("//label[@class='components-toggle-control__label']");
	By saveprofilebutton=By.xpath("//button[contains(text(), 'Save profile')]");
	By savedsuccessmessage=By.xpath("//div[@id='notices']/div/span[2]/span");
	By togglebuttonstatus=By.xpath("//span[contains(@class, 'components-form-toggle')]");
	By togglebuttoninput=By.xpath("//span/input[@class='components-form-toggle__input']");
	By addlinkbutton=By.xpath("//button[@class='button is-compact']");
	By cancelbutton=By.xpath("//button[contains(text(), 'Cancel')]");
	By addwordpressurlbutton=By.xpath("//div/div/div[2]/div/button[1]");
	By addurlbutton=By.xpath("//div/div/div[2]/div/button[2]");
	By enterurlfield=By.xpath("//form[@class='profile-links-add-other']/fieldset/input[1]");
	By enterdescriptionfield=By.xpath("//form[@class='profile-links-add-other']/fieldset/input[2]");
	By addsitebutton=By.xpath("//form[@class='profile-links-add-other']/fieldset/button[1]");
	By logout=By.xpath("//button[@title='Log out of WordPress.com']");
	
public ProfilePage(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement getHeadername() {
		return driver.findElement(headername);
		
	}
	
	public WebElement getVisibleusername() {
		return driver.findElement(visibleusername);
		
	}
	
	public WebElement getFirstname() {
		return driver.findElement(firstname);
	}
	
	public WebElement getLastName() {
		return driver.findElement(lastname);
		
	}
	
	public WebElement getDisplayname() {
		return driver.findElement(displayname);
	}
	
	public WebElement getAboutme() {
		return driver.findElement(aboutme);
	}
	
	public WebElement getHideProfieToggle() {
		return driver.findElement(hideprofiletoggle);
	}
	
	public WebElement getLabelText() {
		return driver.findElement(labeltext);
	}
	
	public WebElement getProfileButton()
	{
		return driver.findElement(saveprofilebutton);
	}
	
	public WebElement getSaveSuccessMessage() {
		return driver.findElement(savedsuccessmessage);
	}
	
	public String getToggleButtonStatus() {
		return driver.findElement(togglebuttonstatus).getAttribute("class");
	}
	
	public WebElement toggleButtonInput() {
		return driver.findElement(togglebuttoninput);
	}
	
	public WebElement AddLinkButton() {
		return driver.findElement(addlinkbutton);
	}
	
	public WebElement CancelButton() {
		return driver.findElement(cancelbutton);
	}
	
	public WebElement addUrlButton() {
		return driver.findElement(addurlbutton);
	}
	
	public WebElement addwordpressurlButton() {
		return driver.findElement(addwordpressurlbutton);
	}
	
	public WebElement geturlfield() {
		return driver.findElement(enterurlfield);
	}
	
	public WebElement getLinkDescription() {
		return driver.findElement(enterdescriptionfield);
	}
	
	public WebElement getAddSiteButton() {
		return driver.findElement(addsitebutton);
	}
	
	public WebElement getLogOutbutton() {
		return driver.findElement(logout);
	}
	
	public void quitDriver()
	{
		driver.quit();
	}
}
