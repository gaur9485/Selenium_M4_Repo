package org.webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement passwordTB = driver.findElement(By.id("pass"));
		Rectangle rec = passwordTB.getRect();
		int passWidth = rec.getWidth();
		int passHeight = rec.getHeight();
		int passXaxis = rec.getX();
		int passYaxis = rec.getY();
		
		System.out.println("Width is :"+ passWidth + " Height is:"+passHeight);
		System.out.println("X-Axis is :"+ passXaxis + " Y-Axis is :"+passYaxis);
	}

}
