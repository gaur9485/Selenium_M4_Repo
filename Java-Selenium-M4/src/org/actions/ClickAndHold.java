package org.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		WebElement rightClickTarget = driver.findElement(By.id("circle"));
		Actions act = new Actions(driver);
		act.clickAndHold(rightClickTarget).perform();
		Thread.sleep(5000);
		act.release(rightClickTarget).perform();
	}

}
