package testNGCrossBrowser;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomPackage.Flib;

public class ParameterizationAndCrossBrowser {
  @Parameters({"bname", "url"})	
  @Test
  public void browserSetup(String browserValue, String url) throws IOException
	{	
	  WebDriver driver = null;
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver= new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
	}
}
