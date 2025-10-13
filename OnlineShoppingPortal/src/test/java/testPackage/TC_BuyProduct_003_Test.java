package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseTest;
import genericLibrary.Flib;
import genericLibrary.SelectUtility;
import pomRepository.CartPage;
import pomRepository.CellPhonePage;
import pomRepository.CheckoutPage;
import pomRepository.ElectronicsPage;
import pomRepository.WelcomePage;

@Listeners(genericLibrary.MyListener.class)
public class TC_BuyProduct_003_Test extends BaseTest {
	
	@Test
	public void buyProductTC() throws IOException, InterruptedException {
		
		Flib flib = new Flib();
		
		WelcomePage wp = new WelcomePage(driver);
		wp.getElectronicsLink().click();
		
	    ElectronicsPage ep=new ElectronicsPage(driver);
	    ep.getCellPhoneLink().click();
	    
	    CellPhonePage cp = new CellPhonePage(driver);
	    cp.getsmartphoneAddToCartButton().click();
	    
	    System.out.println(cp.getProductAddedMsg().getText());
	    
	    Thread.sleep(4000);
	    
	    wp.getShoppingCartLink().click();
	    
	    CartPage scp = new CartPage(driver);
	    
	    //String expectedTitle = "The product has been added to your shopping cart";
	    
	    //SoftAssert sa = new SoftAssert();
	    //sa.assertEquals(cp.getProductAddedMsg().getText(), expectedTitle, "Product is not added to cart");
	    
	    if(scp.getSmartPhoneCartItem().isDisplayed())
	    {						
	    	System.out.println("Product is added to cart");
	    }
	    
	    else
	    {
	    	System.out.println("Product is not added to cart");
	    }
	    
	    
	    scp.getsmartPhoneRemoveCheckBox().click();
	    scp.getTermasOfServicesCheckbox().click();
	    scp.getCheckoutButton().click();
	    
	    String city = flib.readExcelData(EXCEL_PATH_TEST, BUY_PRODUCT_DETAILS, 1, 0);
	    String address1 = flib.readExcelData(EXCEL_PATH_TEST, BUY_PRODUCT_DETAILS, 1, 1);
	    String pincode = flib.readNumericData(EXCEL_PATH_TEST, BUY_PRODUCT_DETAILS, 1, 2);
	    String mob=flib.readNumericData(EXCEL_PATH_TEST, BUY_PRODUCT_DETAILS, 1, 3);
	    
	    SelectUtility su = new SelectUtility();
	    String random = su.random();
	    String contactNo = mob+random;
	    
	    CheckoutPage cop = new CheckoutPage(driver);
	    cop.buyProductMethod(city, address1, pincode, contactNo);
	}

}
