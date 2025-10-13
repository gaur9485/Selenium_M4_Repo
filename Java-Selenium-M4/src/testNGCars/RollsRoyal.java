package testNGCars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RollsRoyal {
  @Test
  public void launchRollsRoyal() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://www.rolls-roycemotorcars.com/en_GB/");
	  Thread.sleep(3000);
	  driver.close();
  }
}
