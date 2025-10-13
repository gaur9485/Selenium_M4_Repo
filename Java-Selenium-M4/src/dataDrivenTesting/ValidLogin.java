package dataDrivenTesting;

//import java.io.FileInputStream;
import java.io.IOException;
//import java.time.Duration;
//import java.util.Properties;

//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		Flib flib = new Flib();
		String email = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 0);
		String password = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 1);
		
		BaseTest bt = new BaseTest();
		bt.browserSetup();
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(500);
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();				
	}

}
