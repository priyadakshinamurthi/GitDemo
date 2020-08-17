package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class base {
   
	public WebDriver driver;
	public WebDriver getBrowser() throws IOException
	{
		Properties p=new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Dakshinamurthi\\eclipse-workspace\\Program\\src\\main\\java\\resources\\browser.properties");
		p.load(fis);
		String browser = p.getProperty("browser");
		//String browser=System.getProperty("browser");
		String url=p.getProperty("url");
		if(browser.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dakshinamurthi\\Documents\\chromedriver.exe");
			ChromeOptions c= new ChromeOptions();
			if(browser.contains("headless"))
			{
			c.addArguments("--headless");
			}
			driver = new ChromeDriver(c);
			driver.get(url);
			
		}
		else if(browser.equals("IE"))
		{
			
		}
		else if(browser.equals("Firefox"))
		{
			
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	public String screenshot(WebDriver driver, String path) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"\\reports\\"+path+".png";
		FileUtils.copyFile(source, new File(destination));
		return destination;
	}
}
