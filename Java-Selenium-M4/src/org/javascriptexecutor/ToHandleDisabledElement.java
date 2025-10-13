package org.javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		WebElement disabledTextbox = driver.findElement(By.id("tb2"));
		Thread.sleep(1000);
		
		//typecast webdriver ref. to JavascriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//To pass input in Disabled Textbox by using 'document' 
		//jse.executeScript("document.getElementById('tb2').value='Gaurav'");
		
		//To pass input in Disabled Textbox by using 'arguments[0]'
		jse.executeScript("arguments[0].value='Gaurav'", disabledTextbox);
	}

}
