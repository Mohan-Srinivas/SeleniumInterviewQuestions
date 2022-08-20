package AssertVsVerifyExamples;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVSVerify 
{

	@Test 
	public void test()
	{
		System.out.println("Before Assertion");
		Assert.assertEquals(true, false);
		System.out.println("After Assertion"); 
	}

	@Test
	public void verify()
	{
		System.out.println("Before Assertion");
		SoftAssert assert1=new SoftAssert();
		assert1.assertEquals(true, false);
		System.out.println("After Assertion");
		assert1.assertAll();
	}
}

/*

"Assert will halt the execution if it fails" but 
Verify will continue the execution. This is absolutely true.
But what we have to ensure is, 
there is no method for "verifying" as we have for assert.
This is the minute thing in this concept. we have a hard assertion (assertion)
and soft assertion (verification). There is no Verify in TestNG.

 *
 */