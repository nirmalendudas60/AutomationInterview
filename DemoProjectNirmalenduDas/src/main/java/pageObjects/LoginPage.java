package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

WebDriver driver;
	
	By username = By.xpath("//input[@id='usernameOrEmail']");
	By continuebutton = By.xpath("//button[text()='Continue']");
	By password = By.xpath("//input[@id='password']");
	By loginButton = By.xpath("//button[text()='Log In']");
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement getUsername() {
		return driver.findElement(username);
		
	}
	
	public WebElement getContinueButton() {
		return driver.findElement(continuebutton);
		
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getLoginButton() {
		return driver.findElement(loginButton);
		
	}

	
}


