package testPackage;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenParameterization {
  @Test
  public void launchGoogle() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  
	  String url = System.getProperty("url");
	  driver.get(url);
	  
	  String data = System.getProperty("data");
	  
	  driver.switchTo().activeElement().sendKeys(data, Keys.ENTER);
	  
	  
	  
	  
  }
}
