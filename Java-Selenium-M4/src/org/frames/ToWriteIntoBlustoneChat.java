package org.frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToWriteIntoBlustoneChat {
	public static void main(String[] args) throws InterruptedException {
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait explicitWait=new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://www.bluestone.com/");
			
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("fc_widget")));
		WebElement chatIcon = explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("chat-icon")));
		chatIcon.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-name")).sendKeys("Gaurav");
//		
//		explicitWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("fc_widget")));
//		WebElement nameField = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("chat-fc-name")));
//		nameField.sendKeys("Gaurav");
//		
		
//		driver.findElement(By.id("denyBtn")).click();
//		
//		driver.switchTo().frame("fc_widget");
//		
//		driver.findElement(By.id("chat-icon")).click();
//		
//		driver.switchTo().defaultContent();
//		
//		driver.findElement(By.id("chat-fc-name")).sendKeys("Gaurav");
//		
	}

}
