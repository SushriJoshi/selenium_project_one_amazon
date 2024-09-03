package amazon_Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazon_Source.Homepage_amazon;
@Listeners(utility_amazon.Listeners_amazon.class)
public class Testcase2_search extends launchquit_amazon
{

	@Test(retryAnalyzer=utility_amazon.Retrylogic_amazon.class)
	public void login_to_amazon()
	{
		Homepage_amazon h1=new Homepage_amazon(driver);
		h1.search();
		

	}	
}