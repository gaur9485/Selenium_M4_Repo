package org.handlingPopups;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup {
	public static void main(String[] args) throws InterruptedException {
		LocalDateTime dateAndTime = LocalDateTime.now();
		String month = dateAndTime.getMonth().toString();
		System.out.println(month);
		
		String newMonth = month.charAt(0)+month.substring(1).toLowerCase();
		System.out.println(newMonth);
		
		int day=dateAndTime.getDayOfMonth();
		System.out.println(day);
		
        WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'December')]/../..//p[text()='20']")).click();
		
		//Dynamic xpath
		//driver.findElement(By.xpath("//div[contains(text()," + newMonth + ")]/../..//p[text()=" + day +"]")).click();
		
	}

}
