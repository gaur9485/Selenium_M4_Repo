package testNGCars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mercedes {
  @Test
  public void launchMercedes() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://www.mercedes-benz.co.in/");
	  Thread.sleep(3000);
	  driver.close();
  }
}
