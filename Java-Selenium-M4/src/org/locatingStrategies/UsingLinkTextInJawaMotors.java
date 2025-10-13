package org.locatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkTextInJawaMotors {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jawamotorcycles.com/");
		driver.findElement(By.linkText("MOTORCYCLES")).click();
	}

}
