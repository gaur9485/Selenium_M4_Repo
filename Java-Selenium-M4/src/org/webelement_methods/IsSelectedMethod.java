package org.webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("rkmukesh87@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("rajMukesh@7687");
		WebElement rememberMeChkBox = driver.findElement(By.id("RememberMe"));
		if(rememberMeChkBox.isSelected())
		{
			System.out.println("Remember Me Checkbox is Selected");
		}
		else
		{
			System.out.println("Remember Me Checkbox is not Selected");
			
			rememberMeChkBox.click();
		}
		boolean result = rememberMeChkBox.isSelected();
		System.out.println(result);
		
		//driver.findElement(By.className("login-button")).click();
	}

}
