package org.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		WebElement dobleClickButton = driver.findElement(By.xpath("//button[text()=' Double click Here   ']"));
		Actions act=new Actions(driver);
		//act.doubleClick(dobleClickButton).perform();
		act.moveToElement(dobleClickButton).doubleClick().perform();
	}

}
