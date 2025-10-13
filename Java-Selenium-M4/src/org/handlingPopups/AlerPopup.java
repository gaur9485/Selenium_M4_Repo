package org.handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlerPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		//Alert
		
		driver.findElement(By.id("alert1")).click();
		Thread.sleep(2000);	
		Alert alert = driver.switchTo().alert();		
		System.out.println(alert.getText());		
		alert.accept();
		
		Thread.sleep(3000);
		
		//Confirmation Alert
		
		driver.findElement(By.id("confirm")).click();
		
		Thread.sleep(2000);
		
		Alert confirmationAlert = driver.switchTo().alert();
		
		System.out.println(confirmationAlert.getText());
		
		confirmationAlert.dismiss();
	}

}
