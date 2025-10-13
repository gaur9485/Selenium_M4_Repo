package testPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.CartPage;
import pomRepository.CellPhonePage;
import pomRepository.ElectronicsPage;
import pomRepository.WelcomePage;


@Listeners(genericLibrary.MyListener.class)
public class TC_AddToCart_001_Test extends BaseTest {
	
	@Test
	public void addToCartTC() throws IOException, InterruptedException {
		
		
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
	    
	    Assert.assertTrue(scp.getSmartPhoneCartItem().isDisplayed(), "Product is not added to cart");
	    
//	    if(scp.getSmartPhoneCartItem().isDisplayed())
//	    {
//	    	System.out.println("Product is added to cart");
//	    }
//	    
//	    else
//	    {
//	    	System.out.println("Product is not added to cart");
//	    }
	}
}
