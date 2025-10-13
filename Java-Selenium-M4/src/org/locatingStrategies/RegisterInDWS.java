package org.locatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterInDWS {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Raj");
		driver.findElement(By.id("LastName")).sendKeys("Kapoor");
		driver.findElement(By.id("Email")).sendKeys("rkmukesh87@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("rajMukesh@7687");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("rajMukesh@7687");
		driver.findElement(By.id("register-button")).click();
		
	}

}
