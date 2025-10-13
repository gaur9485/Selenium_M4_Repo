package org.locatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingSendKeysInGoogle {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement searchBar = driver.findElement(By.name("q"));
		searchBar.sendKeys("KGF Chapter 2", Keys.ENTER);
	}
	

}
