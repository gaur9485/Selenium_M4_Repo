package org.locatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingAnElementUsingXpathByLogicalOr {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/LogicalOperators.html");
		WebElement firstNameTextBox = driver.findElement(By.xpath("//input[@id='fn' and @name='first']"));
		firstNameTextBox.clear();
		firstNameTextBox.sendKeys("Gaurav");

}
}
