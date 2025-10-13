package org.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		WebElement mobileChargerSrc = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		String mobileChargerBackgroundBeforeDrop = mobileChargerSrc.getCssValue("Background");
		System.out.println(mobileChargerBackgroundBeforeDrop);
		
        WebElement mobileChargerDest = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
        
        Actions act = new Actions(driver);
        
        act.dragAndDrop(mobileChargerSrc, mobileChargerDest).perform();
        
        Thread.sleep(2000);
        
        String mobileChargerBackgroundAfterDrop = mobileChargerDest.getCssValue("Background");
        
        if(mobileChargerBackgroundBeforeDrop.equals(mobileChargerBackgroundAfterDrop))
        {
              System.out.println("Element is not dropped at Right location");
        }
        
        else
        {
        	System.out.println("Element is dropped at Right location");
        }     
        
        
        
        
		
		
	}

}
