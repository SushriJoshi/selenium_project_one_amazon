package amazon_Source;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileEdit_amazon 
{
	ChromeDriver driver;
	//locate the element by find by
	
	//go to account and list and click on manage profile
	
	
	@FindBy(xpath="//div[@class='sc-kgTSHT fKJwkr']")
	WebElement viewbutton;
	
	@FindBy(xpath="//div[.='Height and weight']")
	WebElement heightandweight;
	
	@FindBy(xpath="//div[.='Add']")
	WebElement addbutton;
	
	//write method
			
		public void view()
		{
			viewbutton.click();
		}
		
		public void heightweight()
		{
			heightandweight.click();
		}
		public void add()
		{
			addbutton.click();
		}
		
	

		//initializing the constructor using pagefactory class
		public ProfileEdit_amazon(ChromeDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	
	
	


