package demoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	public WebDriver driver;
	@FindBy(name="mobileNo")
	public WebElement mbno;
	@FindBy(name="password")
	public WebElement pwd;
	@FindBy(xpath="(//*[@type='button'])[4]")
	public WebElement signin;
	@FindBy(xpath="//*[text()='Enter your mobile number']")
	public WebElement blank_mbno_err;
	@FindBy(xpath="(//*[text()='Enter password'])[2]")
	public WebElement blank_pwd_err;
	//operations
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void fillMobileNo(String x)
	{
		mbno.sendKeys(x);
		
	}
	
	public void fillPwd(String x)
	{
		pwd.sendKeys(x);
	}
	public void signIn()
	{
		signin.click();
	}
	
	
	
	
	
	

}
