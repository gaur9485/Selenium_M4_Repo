package org.webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.*;

public class UsingNavigationMethodsOnWebPage {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yamaha-motor-india.com/");
		Thread.sleep(3000);
		driver.get("https://www.jawamotorcycles.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		//navigating forward to jawa motors
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().to("https://in.bookmyshow.com/");
		Thread.sleep(3000);
		driver.navigate().to(new URL("https://www.irctc.co.in/"));
		
		
	}

}
