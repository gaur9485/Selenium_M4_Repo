package testNGAssertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToUnderstandSoftAssert {
  @Test
  public void login() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		String expectedWelcomePageTitle= "Demo Web Shop  ";
		String expectedLoginPageTitle="Demo Web Shop. Login  ";
		
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), expectedWelcomePageTitle, "Welcome page is not displayed !!");
				
		driver.findElement(By.linkText("Log in")).click();
		
		sa.assertEquals(driver.getTitle(),expectedLoginPageTitle, "Login Page is not displayed !!");
				
		
		driver.findElement(By.id("Email")).sendKeys("rkmukesh87@gmail.com");
		Thread.sleep(500);
		
		
		driver.findElement(By.id("Password")).sendKeys("rajMukesh@7687");
		Thread.sleep(500);
		
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(500);
		
		
		driver.close();
		sa.assertAll();
		
  }
}
