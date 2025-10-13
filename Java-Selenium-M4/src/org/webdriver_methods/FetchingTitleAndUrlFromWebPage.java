package org.webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingTitleAndUrlFromWebPage {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ferrerorocher.com/");
		String title = driver.getTitle();
		System.out.println("Title : " + title);
		String url = driver.getCurrentUrl();
		System.out.println("Url : " +url);
	}

}
