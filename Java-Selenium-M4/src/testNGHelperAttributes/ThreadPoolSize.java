package testNGHelperAttributes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadPoolSize {
	@Test(invocationCount = 5 , threadPoolSize = 3)
	  public void facebook() throws InterruptedException {  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.facebook.com/");
		  
		  Thread.sleep(2000);
		  driver.close();
	  }
	  
	  @Test(enabled = false)
	  public void instagram() {  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.instagram.com/");
	  }
}

//TPS cant be used independently. can be used with invocation count.

