package org.takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingScreenshotOfAWebElement {
	public static void main(String[] args) throws IOException {
		LocalDateTime ldt = LocalDateTime.now();
		String timeStamp = ldt.toString().replace(":", "-");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		
		File screenshot = logo.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Errorshots/"+timeStamp+"screenshot.png");
		FileHandler.copy(screenshot,dest);
		
	}

}
