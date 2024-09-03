package amazon_Test;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazon_Source.Homepage_amazon;
import amazon_Source.Productpage_amazon;
import amazon_Source.Searchresultspage_amazon;
@Listeners(utility_amazon.Listeners_amazon.class)

public class Testcase7_addtocart extends launchquit_amazon
{

	@Test(retryAnalyzer=utility_amazon.Retrylogic_amazon.class)
	public void cart()
	{
		Homepage_amazon h1=new Homepage_amazon(driver);
		h1.search();
		
		Searchresultspage_amazon s1=new Searchresultspage_amazon(driver);
		s1.selectshoe();
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> id=ids.iterator();
		String parentid=id.next();
		String childid=id.next();
		driver.switchTo().window(childid);
		System.out.println(parentid);
		
		Productpage_amazon p1=new Productpage_amazon(driver);
		p1.addtocart();
	}
	
}
