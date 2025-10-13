package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Declaration
	@FindBy(id = "Email") private WebElement loginEmailTB;
	@FindBy(id = "Password") private WebElement loginPasswordTB;
	@FindBy(id = "RememberMe") private WebElement rememberMeCheckBox;
	@FindBy(linkText = "Forgot password?") private WebElement forgotPasswordLink;
	@FindBy(xpath = "//input[@value='Log in']") private WebElement loginButton;
	
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//Utilization

	public WebElement getLoginEmailTB() {
		return loginEmailTB;
	}


	public WebElement getLoginPasswordTB() {
		return loginPasswordTB;
	}


	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}


	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	// Operational method / Business Logic
	
	public void validLogin(String email, String password) throws InterruptedException
	{
		loginEmailTB.sendKeys(email);
		Thread.sleep(500);
		loginPasswordTB.sendKeys(password);
		Thread.sleep(500);
		loginButton.click();
	}
	
	public void invalidLogin(String email, String password) throws InterruptedException
	{
		loginEmailTB.sendKeys(email);
		Thread.sleep(500);
		loginPasswordTB.sendKeys(password);
		Thread.sleep(500);
		loginButton.click();
		Thread.sleep(500);
		
		loginEmailTB.clear();
		loginPasswordTB.clear();
		Thread.sleep(1000);
	}
	
	
	

}

