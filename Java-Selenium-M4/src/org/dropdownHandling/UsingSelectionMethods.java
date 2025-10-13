package org.dropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectionMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select select=new Select(monthDropDown);
		
		if(select.isMultiple())
		{
			System.out.println("Multi select dropdown");
		}
		else
		{
			System.out.println("Songle select dropdown");
		}
		Thread.sleep(1000);
		select.selectByIndex(10);
		Thread.sleep(1000);
		select.selectByVisibleText("May");
		Thread.sleep(1000);
		select.selectByValue("12");
		
		
		
	}

}
