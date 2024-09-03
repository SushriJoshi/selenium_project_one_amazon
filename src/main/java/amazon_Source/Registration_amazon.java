package amazon_Source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_amazon 
{
ChromeDriver driver;
	
	//locate using FindBy annotation
	@FindBy(id="ap_customer_name")
	WebElement yourname;
	
	@FindBy(id="ap_phone_number")
	WebElement yourphnnumber;
	
	@FindBy(xpath="//input[@class='a-input-text a-span12 auth-required-field auth-require-fields-match auth-require-password-validation']")
	WebElement givepassword;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement verifymobilenumber;
	
	//write individual methods
	public void name()
	{
		yourname.sendKeys("sushri");
	}
	
	public void phnnumber()
	{
		yourphnnumber.sendKeys("2365149856");
	}
	
	public void givepwd()
	{
		givepassword.sendKeys("Sushri@123");
	}
	
	public void verify()
	{
		verifymobilenumber.click();
	}
	
	//initializing the constructors using page factory class.
	public Registration_amazon(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
