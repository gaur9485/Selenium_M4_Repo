package dataDrivenTesting;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.browserSetup();
		
		driver.findElement(By.linkText("Log in")).click();
		
		Flib flib = new Flib(); 
		int rc = flib.rowCount(EXCEL_PATH, INVALIDCREDS);
		
		for(int i=1; i<=rc; i++)
		{
			String email =flib.readExcelData(EXCEL_PATH, INVALIDCREDS, i, 0);
			String password = flib.readExcelData(EXCEL_PATH, INVALIDCREDS, i, 1);
			
			driver.findElement(By.id("Email")).sendKeys(email);
			Thread.sleep(500);
			driver.findElement(By.id("Password")).sendKeys(password);
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			
			Thread.sleep(500);
			driver.findElement(By.id("Email")).clear();
			driver.findElement(By.id("Password")).clear();
			Thread.sleep(500);
			
		}
		
	}

}
