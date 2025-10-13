package org.webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("rkmukesh87@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("rajMukesh@7687");
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginButton.submit();
	}

}
