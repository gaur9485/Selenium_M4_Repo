package org.webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSizeRelatedMethodsOnWebPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Dimension actualSize = driver.manage().window().getSize();
		System.out.println("Height : " + actualSize.getHeight());//Height : 708
		System.out.println("Width : " + actualSize.getWidth());//Width : 1050
		
		Thread.sleep(4000);
		
		Dimension targetSize = new Dimension(700,350);
		driver.manage().window().setSize(targetSize);
		//Validation
		System.out.println(driver.manage().window().getSize());
	}

}
