package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class baseClass {
public	WebDriver driver;
@BeforeClass
public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	System.out.println("browser launch successfully");	
}	
@BeforeMethod
public void enterUrl() {
	
	driver.manage().window().maximize();
	driver.get("https://mamaearth.in/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}
@AfterMethod
public void teardown() {
driver.close();
System.out.println("browser close successfully");
	
}
	
	
	
	
	
	
}
