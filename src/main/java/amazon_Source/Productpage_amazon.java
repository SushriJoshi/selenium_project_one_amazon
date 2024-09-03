package amazon_Source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage_amazon 
{
	ChromeDriver driver;
	//locate the element
	@FindBy(xpath="//a[@title='Add to Wish List']")
	WebElement addtowishlist;
	
	@FindBy(id="add-to-cart-button")
	WebElement cartbutton;
	
	//write method
	public void wishlist()
	{
		addtowishlist.click();
	}
	
	public void addtocart()
	{
		cartbutton.click();
	}
	
	
	//initializing the constructor using pagefactory class
	public Productpage_amazon(ChromeDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
