package amazon_Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazon_Source.Homepage_amazon;
import amazon_Source.Loginamazon;

@Listeners(utility_amazon.Listeners_amazon.class)
public class Testcase1_login extends launchquit_amazon
{
	@Test(retryAnalyzer=utility_amazon.Retrylogic_amazon.class)
	public void login_to_amazon()
	{
		Homepage_amazon h1=new Homepage_amazon(driver);
		h1.account_list(driver);
		h1.sign_in();
		
		Loginamazon l1=new Loginamazon(driver);
		l1.e_mail();
		l1.cnt();
		l1.pwd();
		l1.signbutn();
	}
}
