package testNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListner1 implements ITestListener{
	public void onTestFailure(ITestResult result) {
	    System.out.print("Message from IListner is Filed");
	  }
	
	

}
