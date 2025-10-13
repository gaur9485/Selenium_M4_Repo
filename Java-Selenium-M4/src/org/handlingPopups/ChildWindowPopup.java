package org.handlingPopups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://omayo.blogspot.com/");
			String parentWindowId = driver.getWindowHandle();
			
			driver.findElement(By.linkText("Open a popup window")).click();
			Thread.sleep(2000);
			
			Set<String> allWindowIds = driver.getWindowHandles();
			
			allWindowIds.remove(parentWindowId);
			
			for(String wi:allWindowIds)
			{
				driver.switchTo().window(wi);
			}
			
			driver.close();
			
	}

}
