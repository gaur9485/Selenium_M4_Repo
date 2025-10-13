package org.javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToHandleFacebookTextBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://en-gb.facebook.com/r.php?entry_point=login");
		
		WebElement hiddenElement = driver.findElement(By.id("custom_gender"));
		
		//WebElement dropdownBox = driver.findElement(By.id("preferred_pronoun"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].value='Is it working'",hiddenElement);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[text()='Custom']/..")).click();
	}

}
