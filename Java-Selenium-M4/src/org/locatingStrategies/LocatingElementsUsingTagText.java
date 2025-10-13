package org.locatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementsUsingTagText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Motorola edge 60");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.partialLinkText("Fusion (Pantone Slipstream")).click();
		
	
	
	}

}
