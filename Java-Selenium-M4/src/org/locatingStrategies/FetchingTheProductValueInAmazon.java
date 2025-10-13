package org.locatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchingTheProductValueInAmazon {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone16");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement webel = driver.findElement(By.xpath("//span[contains(text(),'iPhone 16 256 GB: 5G Mobile Phone') and contains(text(),'Pink')]/../../../..//span[text()='₹')]"));
		String str= webel.getText();
		System.out.println(str);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'iPhone 16 256 GB: 5G Mobile Phone') and contains(text(),'Pink')]/../../../..//button[text()='Add to cart']")).click();
	}
}
