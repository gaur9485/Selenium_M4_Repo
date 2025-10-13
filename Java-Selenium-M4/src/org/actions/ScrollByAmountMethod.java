package org.actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByAmountMethod {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		
		Actions act = new Actions(driver);
		
		act.scrollByAmount(0, 5000).perform();
		act.pause(3000).scrollByAmount(0, 1500-5000).perform();
		
		
	}

}
