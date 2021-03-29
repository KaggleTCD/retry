package retryanalyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class MyTransformer implements IAnnotationTransformer {
	
	public void transform(ITestAnnotation iTestAnnotation,Class testClass, Constructor testConstructor,Method method) {
		
		iTestAnnotation.setRetryAnalyzer(RetryAnalyzer.class);
	}

}
