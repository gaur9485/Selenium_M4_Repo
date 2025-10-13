package org.frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToEnterMobileNumberInDream11 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dream11.com/dream11-team-today");
		WebElement frame = driver.findElement(By.id("send-sms-iframe"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.id("regEmail")).sendKeys("9876543210");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("hamburger")).click();
	}

}
