package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;
import resources.base;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import CompleteProgram.QAHomePage;

@RunWith(Cucumber.class)
public class StepDefinitionPractice extends base {

    @Given("^Initialize the browser \"([^\"]*)\"$")
    public void initialize_the_browser_something(String strArg1) throws Throwable {
    	QAHomePage h = new QAHomePage();	
    	driver = h.getBrowser();
    	Thread.sleep(30000);
    }
    
    @And("^click on Login button$")
    public void click_on_login_button() throws Throwable {
    	HomePageObjects hp=new HomePageObjects(driver);	
		hp.getLogin().click();
		Thread.sleep(3000);
    }
    
    @And("^Enter (.+) and (.+)$")
    public void enter_and(String username, String password) throws Throwable {
    	LoginPageObjects lp = new LoginPageObjects(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		Thread.sleep(3000);
    }

    @When("^clicking Login button$")
    public void clicking_login_button() throws Throwable {
    	driver.findElement(By.name("commit")).click();
    }

    @Then("^User should navigate to home page$")
    public void user_should_navigate_to_home_page() throws Throwable {
    	
    	Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='navbar-current-user']")).isDisplayed());
    }

 

}

