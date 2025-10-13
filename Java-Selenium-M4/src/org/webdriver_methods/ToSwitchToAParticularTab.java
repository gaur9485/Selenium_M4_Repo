package org.webdriver_methods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToAParticularTab {
	public static void main(String[] args) {
		String expectedPageUrl = "https://www.zomato.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.zomato.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://magicpin.in/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://shariefbhai.com/");
		Set<String> allWindowIds = driver.getWindowHandles();
		System.out.println(allWindowIds);
		for(String windowId : allWindowIds)
		{
			driver.switchTo().window(windowId);
			if(driver.getCurrentUrl().equals(expectedPageUrl))
			{
				break;
			}
		}
		
		
		
		
		
		
		
		}

}
