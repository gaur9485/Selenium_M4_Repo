package org.javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(1000);
		//typecast webdriver ref. to JavascriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollTo(0,800)");
		Thread.sleep(1000);
		
		jse.executeScript("window.scrollTo(0,400)");
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}

}
