package utility_amazon;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retrylogic_amazon implements IRetryAnalyzer
{
	int current_count=0;
	int retry_count=2;

	@Override
	public boolean retry(ITestResult result) 
	{
		if(current_count<retry_count)
		{
			current_count++;   //Go and retry
			return true;
		}		
		
		return false;  //do not retry
	}
	
}
