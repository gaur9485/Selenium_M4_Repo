package dataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IautoConstant {
	
	static WebDriver driver;
	
	public void browserSetup() throws IOException
	{
		Flib flib=new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH, "chrome");
		String url = flib.readPropertyData(PROP_PATH, "url");
		
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
	
	public void tearDown()
	{
		driver.quit();
	}

}
