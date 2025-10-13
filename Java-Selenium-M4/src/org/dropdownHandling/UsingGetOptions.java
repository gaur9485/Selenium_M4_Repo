package org.dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingGetOptions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		WebElement dateDropDown = driver.findElement(By.id("day"));
		Select select=new Select(dateDropDown);
		List<WebElement> options = select.getOptions();
		System.out.println(options.size());
		for( WebElement option : options)
		{
			String text=option.getText();
			select.selectByVisibleText(text);
		}
	}

}
