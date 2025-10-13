package org.locatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLocateImageUsingCssSelector {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Mobiles")).click();
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nord 4");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.partialLinkText("Nord 4 5G (Oasis Green, 8GB")).click();
		driver.findElement(By.cssSelector("img[alt='S24U']")).click();
		
	}

}
