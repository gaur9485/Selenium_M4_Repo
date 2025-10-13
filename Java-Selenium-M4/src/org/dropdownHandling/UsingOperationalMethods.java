package org.dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingOperationalMethods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement dropDown = driver.findElement(By.id("multiselect1"));
		Select select=new Select(dropDown);
		select.selectByIndex(0);
		select.selectByVisibleText("Audi");
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		System.out.println("========== Selected options are ==========");
		
		for(WebElement option:selectedOptions)
		{
			System.out.println(option.getText());
		}
		
		List<WebElement> options = select.getOptions();
		options.removeAll(selectedOptions);
		
		System.out.println("========== Unselected options are ==========");
		
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}
		
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		System.out.println("First selected option : "+ firstSelectedOption.getText());
		
		
		
	}

}
