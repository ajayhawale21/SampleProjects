package mavLearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLogin {
	
@FindBy(xpath = "//input[@id='userid']")	
private WebElement UserID;
	
@FindBy(xpath ="//input[@id='password']")
	private WebElement password;

@FindBy(xpath ="//button [@type='submit']")
	private WebElement login;

public kiteLogin(WebDriver driver){
	PageFactory.initElements(driver, this);
	
}
	public void enterUserName(String usrID) {
		UserID.sendKeys(usrID);	
	}
	
	public void enterPassword(String pswd) {
	password.sendKeys(pswd);
	}
	
	public void loginButton() {
		login.click();	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
