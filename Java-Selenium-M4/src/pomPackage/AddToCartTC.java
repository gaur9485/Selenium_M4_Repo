package pomPackage;

import java.io.IOException;

public class AddToCartTC extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		 
		BaseTest bt= new BaseTest();
		bt.browserSetup();
		
		Flib flib = new Flib();
		String email = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 0);
		String password = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 1);
		
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(email, password);
		
		wp.getElectronicsLink().click();
		
	    ElectronicsPage ep=new ElectronicsPage(driver);
	    ep.getCellPhoneLink().click();
	    
	    CellPhonePage cp = new CellPhonePage(driver);
	    cp.getsmartphoneAddToCartButton().click();
	    
	    System.out.println(cp.getProductAddedMsg().getText());
	    
	    Thread.sleep(4000);
	    
	    wp.getShoppingCartLink().click();
	    
	    CartPage scp = new CartPage(driver);
	    
	    if(scp.getSmartPhoneCartItem().isDisplayed())
	    {
	    	System.out.println("Product is added to cart");
	    }
	    
	    else
	    {
	    	System.out.println("Product is not added to cart");
	    }
	}
}
