package amazon_Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazon_Source.Homepage_amazon;
import amazon_Source.Registration_amazon;
@Listeners(utility_amazon.Listeners_amazon.class)
public class testcase3_registration extends launchquit_amazon
{
	@Test(retryAnalyzer=utility_amazon.Retrylogic_amazon.class)
	public void login_to_amazon()
	{
		Homepage_amazon h1=new Homepage_amazon(driver);
		h1.account_list(driver);
		h1.start();
	//	h1.logout();
		
		
		Registration_amazon r1=new Registration_amazon(driver);
		r1.name();
		r1.phnnumber();
		r1.givepwd();
		r1.verify();
		
		
/*		WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Hello, Sushri']")));
	*/	
//		Assert.assertEquals(h1.logout(), true);
	}	

}
