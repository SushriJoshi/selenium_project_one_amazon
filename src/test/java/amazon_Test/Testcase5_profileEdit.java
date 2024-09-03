package amazon_Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazon_Source.Homepage_amazon;
import amazon_Source.Loginamazon;
import amazon_Source.ProfileEdit_amazon;
@Listeners(utility_amazon.Listeners_amazon.class)

public class Testcase5_profileEdit extends launchquit_amazon
{	
	//ChromeDriver driver;
	@Test(retryAnalyzer=utility_amazon.Retrylogic_amazon.class)
	public void profile_edit()
	{
		Homepage_amazon h1=new Homepage_amazon(driver);    //not working
		h1.account_list(driver);
		
		Loginamazon l1=new Loginamazon(driver);
		l1.e_mail();
		l1.cnt();
		l1.pwd();
		l1.signbutn();
		
		Homepage_amazon h2=new Homepage_amazon(driver);
		h2.account_list(driver);
		h2.profile();
	
		ProfileEdit_amazon p1 = new ProfileEdit_amazon(driver);
		p1.view();
		p1.heightweight();
		p1.add();
	}

}

