package PageOrder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	public WebDriver driver;

	@FindBy(xpath = "//div[text()='Vitamin C Face Wash with Vitamin C and Turmeric for Skin Illumination - 100ml']")
	private WebElement Product;

//constructor
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//method	
	
	public void clickOnProduct (){

		Product.click();
		driver.switchTo().alert().accept();	
	}

}
