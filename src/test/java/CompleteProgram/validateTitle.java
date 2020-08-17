package CompleteProgram;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePageObjects;
import resources.base;

public class validateTitle extends base{

public WebDriver driver;
private static Logger log = LogManager.getLogger(base.class.getName());
@Test
 public void Title() throws IOException
 {
	QAHomePage h = new QAHomePage();
	driver = h.getBrowser();
	HomePageObjects hp=new HomePageObjects(driver);
	log.error("Error occured");
	Assert.assertEquals(hp.getTitle().getText(), "FEATURED COURSES");
	
 }
}
