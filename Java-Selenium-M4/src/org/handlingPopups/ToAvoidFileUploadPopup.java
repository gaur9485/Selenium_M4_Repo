package org.handlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ToAvoidFileUploadPopup {
	public static void main(String[] args) {	
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
	    WebElement fileUploadButton = driver.findElement(By.id("uploadfile"));
		fileUploadButton.sendKeys("‪‪‪‪C:\\Users\\Admin\\Downloads\\Unit4.pdf");   					
	}
}
