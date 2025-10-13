package org.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollFromOriginMethod {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		
		WebElement originElement = driver.findElement(By.xpath("//h2[text()='Sponsored companies']"));
		ScrollOrigin scrollOrigin = ScrollOrigin.fromElement(originElement);
		
		Actions act=new Actions(driver);
		
		act.scrollFromOrigin(scrollOrigin, 0, 1000).perform();
		
		
	}

}
