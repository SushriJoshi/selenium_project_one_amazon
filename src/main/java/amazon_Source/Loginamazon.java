package amazon_Source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginamazon 
{
	ChromeDriver driver;
	
	//locate using FindBy annotation
	@FindBy(id="ap_email_login")
	WebElement emailid;
	
	@FindBy(id="continue")
	WebElement continuebutton;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signinbutton;
	
	//write individual methods
	public void e_mail()
	{
		emailid.sendKeys("9178729957");
	}
	
	public void cnt()
	{
		continuebutton.click();
	}
	
	public void pwd()
	{
		password.sendKeys("Sushri@2024");
	}
	
	public void wrongpwd()
	{
		password.sendKeys("Sushri@222024");
	}
	
	
	
	public void signbutn()
	{
		signinbutton.click();
	}
	
	//initializing the constructors using page factory class.
	public Loginamazon(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
