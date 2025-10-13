package org.locatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingRadioButtonUsingXpathUsingLogicalAnd {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/LogicalOperators.html");
		driver.findElement(By.xpath("//input[@name='Gender' and @value='F']")).click();
		

}
}