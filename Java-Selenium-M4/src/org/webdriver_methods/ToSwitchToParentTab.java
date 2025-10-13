package org.webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToParentTab {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//Capturing the parent tab's window id
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		Thread.sleep(3000);
		//new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		//new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		//to switch the control to a parent's tab
		driver.switchTo().window(parentWindowId);
		
				
	}

}
