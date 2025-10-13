package org.dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingDeselectionMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement dropDown = driver.findElement(By.id("multiselect1"));
		Select select=new Select(dropDown);
		List<WebElement> options = select.getOptions();
		for(WebElement option:options)
		{
			String text= option.getText();
			select.selectByVisibleText(text);
			Thread.sleep(500);
		}
		Thread.sleep(1000);
		select.deselectByIndex(1);
		Thread.sleep(1000);
		select.deselectByVisibleText("Audi");
		Thread.sleep(1000);
		select.deselectByValue("Hyundaix");
		Thread.sleep(1000);
		select.deselectAll();
		
	}

}
