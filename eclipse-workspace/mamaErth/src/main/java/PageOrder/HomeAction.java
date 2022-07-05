package PageOrder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeAction {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@class='StyledInput-sc-1m95fu4-0 dQlmoN search-input']")
	private WebElement SerchBox;

	@FindBy(xpath = "//button[@class='search-button']")
	private WebElement SerchBoxButton;

	// constructor
	public HomeAction(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

// method	

	public void SearchBx(WebDriver driver) {
		
		System.out.println("facewash");
		SerchBox.sendKeys("Face wash");
		SerchBoxButton.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Alert alert=driver.switchTo().alert();
		alert.dismiss();;
	}

}
