package org.synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingExplicitwaitInSS {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://shoppersstack.com/products_page/57");
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		driver.findElement(By.id("Check")).click();
	}

}
