package org.webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTB = driver.findElement(By.id("email"));
		Point emailTBLocation = emailTB.getLocation();
		int xaxis = emailTBLocation.getX();
		int yaxis = emailTBLocation.getY();
		System.out.println("X-axix is:"+xaxis + " Y-axis is:" + yaxis);
	}

}
