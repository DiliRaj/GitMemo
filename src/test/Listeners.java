package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
	    // not implemented
	  }

	@Override
	  public void onTestSuccess(ITestResult result) {
	//	System.out.println("I am printed always");
	    
	  }

	@Override
	  public void onTestFailure(ITestResult result) {
		System.out.println("I am printed always "+result.getName());
	    
	  }

	@Override
	  public void onTestSkipped(ITestResult result) {
	    // not implemented
	  }

	@Override
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    
	  }

	@Override
	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	@Override
	  public void onStart(ITestContext context) {
	   
	  }

	@Override
	  public void onFinish(ITestContext context) {
	    
	  }
	
	

}
