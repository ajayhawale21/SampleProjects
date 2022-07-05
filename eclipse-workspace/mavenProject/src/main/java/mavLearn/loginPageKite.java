package mavLearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageKite {

@FindBy (xpath="//input [@id='totp']")	
private WebElement tpin;

@FindBy (xpath = "//button [@type='submit']")
private WebElement continueButton;


public loginPageKite(WebDriver driver){
	PageFactory.initElements(driver, this);
}
	

public void enterPin(String pin) {
	this.tpin.sendKeys(pin);
}
	
public void clickOnContinueButton() {
	this.continueButton.click();
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
