package testNG;

import org.testng.annotations.Test;

public class TestTestNG2 {
@Test (groups = {"Smoke","Regression"})
	public void test()
	{
		System.out.print("Smoke and Regression");
	}
@Test (groups = {"Regression"})
	public void test1()
{
	System.out.print("Regression");
}
}
