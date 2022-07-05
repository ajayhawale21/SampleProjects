package BasePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void launchBrowser() {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup(); 
		driver=new ChromeDriver(); // browser launch
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
