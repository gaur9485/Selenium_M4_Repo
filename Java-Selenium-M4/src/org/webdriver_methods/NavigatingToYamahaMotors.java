package org.webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingToYamahaMotors {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yamaha-motor-india.com/");
		System.out.println("Main ended");
	}

}
