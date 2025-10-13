package org.javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledButton {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.oracle.com/in/java/technologies/javase/javase7-archive-downloads.html");
		
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("jdk-7u80-windows-i586.exe")).click();
		WebElement disabledLink = driver.findElement(By.partialLinkText("Download jdk-7u80-windows-i586.exe"));
		Thread.sleep(1000);
		
		
		//typecast webdriver ref. to JavascriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].click()",disabledLink);
		//jse.executeScript("document.getElementById('domain_a').click()");
	}

}
