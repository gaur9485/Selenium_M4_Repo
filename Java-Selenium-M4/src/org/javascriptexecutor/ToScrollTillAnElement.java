package org.javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollTillAnElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement targetElement = driver.findElement(By.xpath("//h3[text()='Customer service']"));
		Thread.sleep(1000);
		//typecast webdriver ref. to JavascriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].scrollIntoView(false)", targetElement);
	}

}
