package org.webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		WebElement emailTB = driver.findElement(By.id("Email"));
		String email = "gaurav@gmail.com";
		emailTB.sendKeys(email);
		
		String attValue= emailTB.getAttribute("value");
		System.out.println(attValue);
		
		if(email.equals(attValue)) 
		{
			System.out.println("Eamil is entered correctly");
		}
		else
		{
			System.err.println("Email is not entered correctly");
		}
		
		
	}

}
