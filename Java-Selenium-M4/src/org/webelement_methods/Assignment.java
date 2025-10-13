package org.webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		WebElement emailTB = driver.findElement(By.id("Email"));
		WebElement passTB = driver.findElement(By.id("Password"));
		//Thread.sleep(null);
		// Left Alignment
		int x1 = emailTB.getLocation().getX();
		int x2 = passTB.getLocation().getX();
		int result=x1-x2;
		
		if(result > -5 && result < 5) 
		{
		System.out.println("Left Aligned perfectly");
		
	    }
		else
		{
			System.out.println("Not Left Alighed perfectly");
		}
		
		//Right Alignment
		
		int emailTBWidth = emailTB.getSize().getWidth();
		int passTBWidth = passTB.getSize().getWidth();
		
		int result1 = x1+emailTBWidth;
		int result2 = x2+passTBWidth;
		
		int result3 = result1 - result2;
		
		if(result3 > -5 && result3 < 5)
		{
			System.out.println("Right Aligned perfectly");
		}
		else
		{
			System.out.println("Not Right Aligned perfectly");

		}
		
		//Overlapping
		int y1 = emailTB.getLocation().getY();
		int y2 = passTB.getLocation().getY();
		
		int emailTBHeight = emailTB.getSize().getHeight();
		int passTBHeight = passTB.getSize().getHeight();
		
		int result4 = y1 + emailTBHeight;
		int result5 = y2 + passTBHeight;
		
		int result6 = result5 - result4;
		
		//System.out.println(result6);
		
		if(result6 < 0)
		{
			System.out.println("Text Boxes are overlapping");
		}
		
		if(result6 == 0)
		{
			System.out.println("Text boxes are attached to each other");
		}
		
		else 
		{
			System.out.println("Text boxes are well seperated");
		}
		

}
}
