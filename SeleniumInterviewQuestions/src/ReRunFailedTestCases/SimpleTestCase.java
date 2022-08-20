package ReRunFailedTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTestCase 
{
	@Test
	//@Test(retryAnalyzer = RetryListener.class)
	public void testCase1()
	{
		Assert.assertEquals(false, true);
	}
	@Test
	//@Test(retryAnalyzer = RetryListener.class)
	
	public void testCase2()
	{
		Assert.assertEquals(true, true);
	}
}

/*
 How to Re run the failed testcases
 =====================================
 
  1. We can run the testng failed.xml
  2. Using IRetryAnalyzer interface  
  		retry()
  3. Using IAnnotationTransformer (I) and IRetryAnalyzer interface 
		transform()




*/