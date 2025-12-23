package org.frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToOpenGoogleMaps {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		Thread.sleep(1000);
		
		//driver.switchTo().frame(0); //using index
		
		
		//driver.switchTo().frame("app"); //using id or name
		
		
		//To locate and find the frames where 'Maps' is present
		WebElement frame = driver.findElement(By.xpath("//iframe[@role='presentation']"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		
	}

}
