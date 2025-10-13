package org.handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PromptAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		
		Alert promptAlert = driver.switchTo().alert();	
		promptAlert.sendKeys("Gaurav");
		Thread.sleep(2000);
		System.out.println(promptAlert.getText());
		promptAlert.accept();
		
		
	}

}
