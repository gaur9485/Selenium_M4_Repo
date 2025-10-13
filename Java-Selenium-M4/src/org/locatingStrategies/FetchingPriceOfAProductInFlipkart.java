package org.locatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchingPriceOfAProductInFlipkart {
	
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("samsung");
		driver.findElement(By.xpath("//button[contains(@title,'Search')]")).click();
		String price = driver.findElement(By.xpath("//div[text()='Samsung Guru 1200']/../..//div[contains(text(),'₹')]")).getText();
		System.out.println(price);
		
		
	}
}