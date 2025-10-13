package org.locatingStrategies;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchingToATabAndCloseIt {
	public static void main(String[] args) throws InterruptedException {
		String expectedUrl="https://www.swiggy.com/";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/Assign.html");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();		
		Set<String> windowHandles = driver.getWindowHandles();
		for(String windowHandle: windowHandles)
		{
			driver.switchTo().window(windowHandle);
			String actualUrl=driver.getCurrentUrl();
			//Thread.sleep(2000);
			if(actualUrl.equals(expectedUrl))
			{
			    driver.close();			
			}				
	    }						
	}
}
