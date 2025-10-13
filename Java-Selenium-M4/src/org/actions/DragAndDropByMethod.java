package org.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByMethod {
	
    public static void main(String[] args) {
    	
    	WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();

		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		
		WebElement dragMeButton = driver.findElement(By.xpath("//div[text()='Drag Me']"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDropBy(dragMeButton, 500, 0).pause(Duration.ofSeconds(3)).perform();	
		
		act.pause(3000).dragAndDropBy(dragMeButton, -400, 0).pause(3000).dragAndDropBy(dragMeButton, 0, 100).perform();		
		act.pause(3000).dragAndDropBy(dragMeButton, 200, -300).perform();
	
}

}
