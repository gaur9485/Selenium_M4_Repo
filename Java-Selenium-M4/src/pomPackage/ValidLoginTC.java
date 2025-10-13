package pomPackage;

import java.io.IOException;

public class ValidLoginTC extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.browserSetup();
		
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		
		Flib flib = new Flib();
		String email = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 0);
		String password = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 1);
		
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(email, password);
		
	}

}
