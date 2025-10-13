package org.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod2 {
    public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		
		WebElement srcElement = driver.findElement(By.id("draggable"));
		
		WebElement destElement = driver.findElement(By.id("droptarget"));
		
		String destEleColorBeforeDrop = destElement.getCssValue("color");
		System.out.println(destEleColorBeforeDrop);
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(srcElement, destElement).perform();	
		Thread.sleep(2000);
		
		WebElement destElement2 = driver.findElement(By.id("droptarget"));
		String destEleColorAfterDrop = destElement2.getCssValue("color");
		
		System.out.println(destEleColorAfterDrop);
		
		if(destEleColorBeforeDrop!=destEleColorAfterDrop)
		{
			System.out.println("Element is dropped at correct location");
		}
		
		else
		{
			System.out.println("Element is not dropped at correct location");
		}		
		
	}

}
