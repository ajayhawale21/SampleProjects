package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import Base.baseClass;
import PageOrder.AddToCart;
import PageOrder.HomeAction;
import PageOrder.ProductPage;

public class TestClass extends baseClass {

	HomeAction Ha;
	ProductPage Pp;
	AddToCart AddCart;

	@Test(priority=0 , description ="product buying")
	public void addToCartByAction() {
		Ha = new HomeAction(driver);
		Ha.SearchBx(driver);
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		Pp=new ProductPage(driver);
		Pp.clickOnProduct();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	AddCart = new AddToCart(driver);

	AddCart.AddCartProduct();
	AddCart.addQuantity();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	AddCart.SeeingCart();
	AddCart.oneQuantyMinus();
	}

	

		

	}


