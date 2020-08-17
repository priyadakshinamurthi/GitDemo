package CompleteProgram;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;
import resources.base;

public class QAHomePage extends base {

	public WebDriver driver;
	private static Logger log = LogManager.getLogger(base.class.getName());
	@Test(dataProvider="getData")
	public void run(String username,String password) throws IOException
	{
		QAHomePage h = new QAHomePage();
		driver = h.getBrowser();
		HomePageObjects hp=new HomePageObjects(driver);	
		hp.getLogin().click();
		LoginPageObjects lp = new LoginPageObjects(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		log.info("Success");
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj = new Object[2][2];
		obj[0][0] = "nonrestricteduser@gmail.com";
		obj[0][1] = "abcd";
		
		obj[1][0] = "restricteduser@gmail.com";
		obj[1][1] = "efgh";
		return obj;
		
	}
	
}
