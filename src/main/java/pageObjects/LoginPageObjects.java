package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public WebDriver driver;
	
	public LoginPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By email = By.id("user_email");
	By password = By.id("user_password");
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
}
