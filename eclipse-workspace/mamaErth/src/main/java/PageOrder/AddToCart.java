package PageOrder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
public WebDriver driver;

@FindBy (xpath = "(//button[@class='icon-holder']) [2]")
private WebElement Quantity;

@FindBy (xpath = "//button[@class='Button__MinimalButton-sc-wiqi81-0 Button__Styled-sc-wiqi81-1 cLpIaN ATC_Button']")
private WebElement AddToCart;

@FindBy (id="shopping_cart_black_24dp")
private WebElement Cart;

@FindBy (xpath = "(//button[@class='icon-holder']) [1]")
private WebElement MinusQuantity;

//constructor
public AddToCart(WebDriver driver){
	PageFactory.initElements(driver, this);
}

public void addQuantity(){
	Quantity.click();

}

public void AddCartProduct() {
	AddToCart.click();
}

public void SeeingCart() {
	Cart.click();
}
public void oneQuantyMinus() {
	MinusQuantity.click();
}
}
