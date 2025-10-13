package testNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonePage {
	
	@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@value='Add to cart']") private WebElement smartphoneAddToCartButton;
    @FindBy(xpath = "//p[contains(text(),'added to your')]") private WebElement productAddedMsg;
    
    
    public CellPhonePage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }


	public WebElement getsmartphoneAddToCartButton() {
		return smartphoneAddToCartButton;
	}


	public WebElement getProductAddedMsg() {
		return productAddedMsg;
	}
    
    
    
    
}
