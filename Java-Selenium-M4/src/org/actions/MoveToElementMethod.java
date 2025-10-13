package org.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://licindia.in/en/web/guest/home");
		Actions act= new Actions(driver);
		act.click().perform();
		act.click().perform();
		WebElement aboutUsLink = driver.findElement(By.xpath("//span[text()=' About Us']"));
		act.moveToElement(aboutUsLink).perform();
		WebElement historyLink = driver.findElement(By.xpath("//a[text()='History']"));
		historyLink.click();
		
		
		
	}

}
