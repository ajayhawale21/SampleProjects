package facebook;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Ajay\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	pomClass p=new pomClass(driver);
p.URL();
	p.createnew();
	p.fname("Ajay");
	p.lname("hawale");
	p.email("ajayhawale1997@gmail.com");
	p.passwrd("ajajahaakajaahajaa");
	p.birthd();
	p.mont();
	p.yr();
	p.gendr();
	p.sumit();
	
	
	

}
}
