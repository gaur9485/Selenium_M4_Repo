package org.javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledCheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/checkbox/disabled?sublist=2");
		
		//WebElement disabledCheckbox = driver.findElement(By.id("mode_ab"));
		Thread.sleep(1000);
		
		//typecast webdriver ref. to JavascriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//To pass input in Disabled Textbox by using 'document' 
		jse.executeScript("document.getElementById('mode_ab').click()");
		
		//To pass input in Disabled Textbox by using 'arguments[0]'
		//jse.executeScript("arguments[0].click()", disabledCheckbox);
	}

}
