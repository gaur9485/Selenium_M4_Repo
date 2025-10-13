package org.handlingPopups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotification {
	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-Notifications");
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.easemytrip.com/");
	}

}
