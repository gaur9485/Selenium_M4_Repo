package org.webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingSourceCodeOfAWebPage {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String sourceCode = driver.getPageSource();
		System.out.println("Source code : " + sourceCode);
	}

}
