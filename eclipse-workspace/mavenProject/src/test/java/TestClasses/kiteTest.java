package TestClasses;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import mavLearn.kiteLogin;
import mavLearn.loginPageKite;

public class kiteTest extends BaseClass  {
 kiteLogin ktlogin;
loginPageKite logPgKit;

@BeforeClass 
public void openBrowser() {
	launchBrowser();
	ktlogin = new kiteLogin(driver);
	logPgKit = new loginPageKite(driver);
	
}

@Test
public void loginToKiteApp() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
ktlogin.enterUserName("CZ0573");	
ktlogin.enterPassword("Ajay@1997");
ktlogin.loginButton();

Thread.sleep(3000);

logPgKit.enterPin("1997");
logPgKit.clickOnContinueButton();


}
 
 
 
 
 
}
