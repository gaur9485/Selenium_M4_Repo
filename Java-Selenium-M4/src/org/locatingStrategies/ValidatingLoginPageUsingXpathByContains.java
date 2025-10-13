package org.locatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingLoginPageUsingXpathByContains {
	public static void main(String[] args) {
		String expectedText = "Welcome, Please Sign In!";
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		WebElement loginPageText = driver.findElement(By.xpath("//h1[contains(text(),'Sign In')]"));
		String actualText = loginPageText.getText();
		if(actualText.equals(expectedText))
		{
			System.out.println("Login page displayed successfully");
		}
		else
		{
			System.out.println("Login page is not Displayed!, stop execution");
		}
	}

}
