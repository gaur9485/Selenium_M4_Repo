package org.webdriver_methods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToSwitchToAParticularTabUsingTitle {
	public static void main(String[] args) throws InterruptedException {
		//String expectedPageTitle = "Sharief Bhai - Dakhni Biryani";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		//Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://magicpin.in/");
		//Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://shariefbhai.com/");	
		//Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.zomato.com/");
		Set<String> allWindowIds=driver.getWindowHandles();
		for(String windowId : allWindowIds)
		{
			driver.switchTo().window(windowId);
			Thread.sleep(3000);
			String actualTitle = driver.getTitle();
			if(actualTitle.contains("Groceries")) 
				break;
		
		
		}
		
	}

}
