package org.locatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingWishListIconInFlipkart {
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("GOBOULT");
		driver.findElement(By.xpath("//button[contains(@title,'Search')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Y1 with Zen ENC')]/..//div[text()='Black, True Wireless']/..//*[name()='svg' and @width='16']")).click();
		

}
}
