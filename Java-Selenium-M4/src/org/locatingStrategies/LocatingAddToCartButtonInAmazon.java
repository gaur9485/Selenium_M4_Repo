package org.locatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingAddToCartButtonInAmazon {
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("noise watches for men");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Noise Twist Round dial')]/../../../..//button[text()='Add to cart']")).click();

}
}
