package org.locatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocateMotorolag05 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.linkText("Mobiles & Tablets")).click();
		driver.findElement(By.xpath("//span[text()='Mobiles & Tablets']")).click();
		//driver.findElement(By.cssSelector("input[title='Search for products, brands and more']")).sendKeys("motorola g05");
	    //driver.findElement(By.cssSelector("button[type='submit']")).click();
		//driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
	    Thread.sleep(5000);
		driver.findElement(By.xpath("//img[contains(@alt,'g05 (Plum Red')]")).click();
	}

}
