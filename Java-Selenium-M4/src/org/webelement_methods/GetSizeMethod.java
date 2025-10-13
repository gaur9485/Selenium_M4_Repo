package org.webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTB = driver.findElement(By.id("email"));
		Dimension emailTBSize = emailTB.getSize();
		int emailTBWidth = emailTBSize.getWidth();
		int emailTBHeight = emailTBSize.getHeight();
		
		System.out.println("Width is : "+ emailTBWidth+ " Height is : "+ emailTBHeight);;
	}

}
