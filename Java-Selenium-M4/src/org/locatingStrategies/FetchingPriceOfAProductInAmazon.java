package org.locatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchingPriceOfAProductInAmazon {
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("noise watches for men");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String price=driver.findElement(By.xpath("//span[contains(text(),'NoiseFit Halo') and contains(text(),'Vintage Brown')]/../../../..//span[@class='a-price-whole']")).getText();
		System.out.println(price);
		
		
		

}
}
