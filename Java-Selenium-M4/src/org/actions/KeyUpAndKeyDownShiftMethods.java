package org.actions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpAndKeyDownShiftMethods {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		
		String parentWindowId = driver.getWindowHandle();
		
		Actions act = new Actions(driver);
		
		act.keyDown(loginLink, Keys.SHIFT).click().perform();
		
		act.keyUp(Keys.SHIFT).perform();
		
	    Set<String> allWindowIds = driver.getWindowHandles();
	    
	    allWindowIds.remove(parentWindowId);
	    
	    for(String wi:allWindowIds)
	    {
	    	driver.switchTo().window(wi);
	    }
	    
	    WebElement emailTB = driver.findElement(By.id("Email"));
	    act.sendKeys(emailTB, "gaurav@gmail.com").perform();
		
	}

}
