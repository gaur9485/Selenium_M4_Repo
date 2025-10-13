package org.locatingStrategies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingYoutube {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("Kumar Sanu songs", Keys.ENTER);
		driver.findElement(By.xpath("//a[contains(.,'Superhit Songs (Top 5)')]")).click();
		
	}

}
