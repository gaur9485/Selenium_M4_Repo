package org.dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingGetOptionsInOmayo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement dropDown = driver.findElement(By.id("drop1"));
		Select select=new Select(dropDown);
		List<WebElement> options = select.getOptions();
		for(WebElement option : options)
		{
			String text = option.getAttribute("value");
			select.selectByValue(text);
			Thread.sleep(500);
		}
		
		
	}

}
