package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		WebElement emailTB = driver.findElement(By.id("Email"));
		Thread.sleep(500);
		
		WebElement passwordTB = driver.findElement(By.id("Password"));
		Thread.sleep(500);
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		
		driver.navigate().refresh();
		
		emailTB.sendKeys("gauravgulhane94@gmail.com");// StaleElementReferenceException
		passwordTB.sendKeys("gaurav123");
		loginButton.click();
		
	}

}
