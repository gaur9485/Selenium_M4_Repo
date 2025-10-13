package org.locatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByAttribute {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@data-testid='royal-email']")).sendKeys("harshaqs@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Harsha@123");
	}

}
