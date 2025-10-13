package testNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	//Declaration
	
	@FindBy(xpath = "//th[contains(text(),'Product(s)')]/../../..//a[text()='Smartphone']") private WebElement smartPhoneCartItem;
	@FindBy(xpath = "//th[contains(text(),'Product(s)')]/../../..//input[@type='checkbox']") private WebElement smartPhoneRemoveCheckBox;
	@FindBy(xpath = "//input[@name='updatecart']") private WebElement updateCartButton;
    @FindBy(xpath ="//input[@name='continueshopping']" ) private WebElement continueShoppingButton;
    @FindBy(id = "termsofservice") private WebElement termasOfServicesCheckbox;
    @FindBy(id = "checkout") private WebElement checkoutButton;
    
    
    //Initialization
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//Utilization
	

	public WebElement getSmartPhoneCartItem() {
		return smartPhoneCartItem;
	}

	public WebElement getsmartPhoneRemoveCheckBox() {
		return smartPhoneRemoveCheckBox;
	}

	public WebElement getUpdateCartButton() {
		return updateCartButton;
	}

	public WebElement getSmartPhoneRemoveCheckBox() {
		return smartPhoneRemoveCheckBox;
	}

	public WebElement getContinueShoppingButton() {
		return continueShoppingButton;
	}

	public WebElement getTermasOfServicesCheckbox() {
		return termasOfServicesCheckbox;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}

	
	
	

}
