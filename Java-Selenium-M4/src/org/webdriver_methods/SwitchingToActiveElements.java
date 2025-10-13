package org.webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingToActiveElements {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoshop.webmercs.com/login");
		driver.switchTo().activeElement().sendKeys("KGF Chapter 2");
	}

}
