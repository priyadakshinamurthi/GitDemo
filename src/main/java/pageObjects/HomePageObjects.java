package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {

	
	public WebDriver driver;

	public HomePageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By login = By.xpath("//a[contains(@href,'sign_in')]//span");
	By title = By.xpath("//div[@class='text-center']/h2");
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
    }
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
}