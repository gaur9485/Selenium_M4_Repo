package org.webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCloseAndQuit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.linkedin.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://in.indeed.com/");
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
