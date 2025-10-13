package org.locatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		WebElement emailTB = driver.findElement(By.id("Email"));
		emailTB.sendKeys("Gaurav", Keys.ENTER);
		WebElement errMsg = driver.findElement(By.xpath("//span[@for='Email']"));
		String errMsgColor = errMsg.getCssValue("color");
		
		System.out.println(errMsgColor);
	}

}
