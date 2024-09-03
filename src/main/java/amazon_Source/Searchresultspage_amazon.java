package amazon_Source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchresultspage_amazon 
{
	ChromeDriver driver;
	//locate using findby annotation.
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[45]")
	WebElement shoe45;
	
	//write individual method
	public void selectshoe()
	{
		shoe45.click();
	}
	
	//initializing the constructors using page factory class
	public Searchresultspage_amazon(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
