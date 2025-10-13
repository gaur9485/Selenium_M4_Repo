package org.webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		
		WebElement nameTB = driver.findElement(By.id("name"));
		
		boolean result = nameTB.isEnabled();
		
		if(result==true)
		{
			System.out.println("Name Textbos is Enabled");
		}
		else
		{
			System.out.println("Name Textbox is Not Enabled");
		}
	}

}
