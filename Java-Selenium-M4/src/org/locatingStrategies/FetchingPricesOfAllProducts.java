package org.locatingStrategies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchingPricesOfAllProducts {
	public static void main(String[] args) throws InterruptedException {	
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("noise watches for men");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> prices = driver.findElements(By.className("a-price-whole"));
		System.out.println(prices.size());
		for(WebElement price:prices)
			{
			System.out.println(price.getText());
			Thread.sleep(500);			
			}
	}
}
