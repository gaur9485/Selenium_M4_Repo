package org.webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDispalyed {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		WebElement img = driver.findElement(By.xpath("(//img[@alt='Noise'])[2]"));
		boolean result= img.isDisplayed();
		 if(result==true)
		 {
			 System.out.println("Watch Image is Displayed");
		 }
		 else
		 {
			 System.out.println("Watch Image is not displayed");
		 }
		
	}

}
