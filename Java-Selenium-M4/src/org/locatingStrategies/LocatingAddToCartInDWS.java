package org.locatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingAddToCartInDWS {
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("APPAREL & SHOES")).click();
		driver.findElement(By.xpath("//a[text()='Blue and green Sneaker']/../..//input[@value='Add to cart']")).click();
		
	
	}

}
