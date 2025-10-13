package testNGCars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Astomartin {
  @Test(groups = "FT")
  public void launchAstoMartin() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://www.astonmartin.com/en/models");
	  Thread.sleep(3000);
	  driver.close();
  }
}
