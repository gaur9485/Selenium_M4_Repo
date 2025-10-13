package org.locatingStrategies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddingAllProductToCartInAmazon {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("noise watches for men");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[text()='Add to cart']"));
		System.out.println(addToCartButtons.size());
		
		for(WebElement addToCart : addToCartButtons)
		{
			Thread.sleep(1000);
			addToCart.click();
			Thread.sleep(2000);
		}
	}

}
