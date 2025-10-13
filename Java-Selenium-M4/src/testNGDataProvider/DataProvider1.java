package testNGDataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	@DataProvider(name = "invalidcreds")
	public String [] [] dataProviderMethod()
	{
		String [] [] data = {
				
				           {"qsp123@gmail.com","Qsp#113"},
				           {"123qsp@yahoo.com","yAhOo"},
				           {"qspiders@","qspiders$9876"},
				           {"q s p@gmail.com","Wakad&123"}
								
		                  };
		return data;
	}	
	
	@Test(dataProvider = "invalidcreds", dataProviderClass = testNGDataProvider.DataProvider1.class)
  public void invalidLogin(String email, String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(500);
		
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Password")).clear();
		driver.close();
		
  }
}
