package org.webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingPositionRelatedMethodsInWebPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://wallpapercave.com/");
		
		Point position = driver.manage().window().getPosition();
		System.out.println("X axis :" + position.getX());
		System.out.println("X axis :" + position.getY());
		Thread.sleep(4000);
		Point targetPosition = new Point(200,300);
		driver.manage().window().setPosition(targetPosition);
		
		
	}

}
