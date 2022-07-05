package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class pomClass {

	private WebDriver driver;
	
	String url="https://www.facebook.com/";
	@FindBy (xpath="//a[text()='Create New Account']")
	private WebElement CreatenewAccount;

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement LastName;
	
	@FindBy (xpath="//input[@name='reg_email__']")
	private WebElement EmailId;
	
	@FindBy (xpath="//input[@name='reg_passwd__']")
	private WebElement NewPassword;
	
	@FindBy (xpath="//select[@name='birthday_day']")
	private WebElement BirthDate;
	
	@FindBy (xpath="//select[@name='birthday_month']")
	private WebElement Month;
	
	@FindBy (xpath ="//select[@name='birthday_year']")
	private WebElement Year;
	
	@FindBy (xpath ="//label[text()='Male']")
	private WebElement Gender;
	
	@FindBy (xpath ="//button[@name='websubmit']")
	private WebElement submit;
	
	
 public pomClass (WebDriver driver) {
	this.driver=driver; 
	PageFactory.initElements(driver, this);
 }
 
 public void URL() {
	 driver.get(url); 
	 driver.manage().window().maximize();
	 
 }
 
 public void createnew() {
	 CreatenewAccount.click();
 }
	
	public void fname(String fn) {
		firstname.sendKeys(fn);	
		
	}
	
	public void lname(String ln) {
		LastName.sendKeys(ln);	
		
	}
	
	public void email(String em) {
		EmailId.sendKeys(em);
	}
	
	public void passwrd(String pswd) {
		NewPassword.sendKeys(pswd);
		
	}
	
	
	
	public void birthd() {
		Select s=new Select(BirthDate);
		s.selectByValue("21");
				
	}
	
	 public void mont() {
		 Select s=new Select(Month);
		 s.selectByValue("8");	 
	}
	 
	 public void yr() {
		 Select s=new Select(Year);
		 s.selectByValue("1997");
		 
	 }
	 public void gendr() {
		 Gender.click(); 
	 }
	 
	 public void sumit() {
		 submit.click();
	 }
	 
	 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


