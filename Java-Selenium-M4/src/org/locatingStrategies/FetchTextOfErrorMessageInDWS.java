package org.locatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTextOfErrorMessageInDWS {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("Gaurav", Keys.ENTER);
		//WebElement text = driver.findElement(By.xpath("//span[contains(text(),'Please enter a')]"));
		//String str=text.getText();
		//System.out.println(str);
		WebElement text = driver.findElement(By.xpath("//input[@id='Email']/..//span[@for='Email']"));
		String str=text.getText();
		System.out.println(str);
		
	}

}
