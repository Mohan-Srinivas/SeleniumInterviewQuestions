package ReRunFailedTestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer
{
	int falseCount=0;
	int limit=4;
	@Override
	public boolean retry(ITestResult result) 
	{
		// TODO Auto-generated method stub
		if(falseCount<limit)
		{
			falseCount++;
			return true;
		}
		
		return false;
	}
	
	
	
}
