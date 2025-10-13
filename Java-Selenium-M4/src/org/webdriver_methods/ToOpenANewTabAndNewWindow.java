package org.webdriver_methods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenANewTabAndNewWindow {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fastrack.in/");
		Thread.sleep(2000);
		//to open a new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.titan.co.in/");
		Thread.sleep(2000);
		//to open a new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.rolex.com/en-us");
		
		Set<String> allWindowIds =  driver.getWindowHandles();
		System.out.println(allWindowIds);
		
	}

}
