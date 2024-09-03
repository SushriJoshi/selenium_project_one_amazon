package amazon_Source;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Homepage_amazon 
{
	ChromeDriver driver;
	//Step1--locate account and list, sign in button and search text field by FindBy annotation.
	@FindBy(id="nav-link-accountList")
	WebElement accountandlist;
	
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signinbutton;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchtf;
	
	@FindBy(xpath="(//a[.='Start here.'])[1]")
	WebElement starthere;
	
	@FindBy(linkText="Sign Out")
	WebElement logoutbutton;
	
	@FindBy(xpath="//div[@class='sc-GKYbw iNmWLy']")
	WebElement manageprofile;
	
	
	//Step2-- Write individual methods for each elements
	public void account_list(ChromeDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();
	}
	
	public void profile()
	{
		manageprofile.click();
	}
	
	public void sign_in()
	{
		signinbutton.click();
	}
	
	public void search()
	{
		searchtf.sendKeys("shoes"+Keys.ENTER);
	}
	
	public void start()
	{
		starthere.click();
	}
	
	public void logout()
	{
		logoutbutton.isDisplayed();
	}
	
	//initializing the elements under constructor using page factory class.
	public Homepage_amazon(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
