package org.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		WebElement rightClickTarget = driver.findElement(By.id("btn_a"));
		Actions act=new Actions(driver);
		act.contextClick(rightClickTarget).perform();
		act.moveToElement(rightClickTarget).contextClick().perform();
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		String text = driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).getText();
		System.out.println(text);
		
	}
	

}
