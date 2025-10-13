package org.basics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingAllBrowsers {
	
	public static void main(String[] args) {
		
		System.out.print("Enter browser name ");
		Scanner sc = new Scanner(System.in);
		String browserName=sc.next();
		WebDriver driver = null;
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			System.err.println("Invalid Browser");
		}
		
		driver.get("https://www.zomato.com/");
		
		
		
	}

}
