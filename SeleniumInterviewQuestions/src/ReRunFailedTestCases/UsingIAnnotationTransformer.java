package ReRunFailedTestCases;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class UsingIAnnotationTransformer implements IAnnotationTransformer
{
	@Override
	public void transform(ITestAnnotation annotation,Class testclass,Constructor testCon,Method testMethos)
	{
		annotation.setRetryAnalyzer(RetryListener.class);
	}

}
