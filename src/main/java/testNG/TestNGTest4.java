package testNG;

import org.testng.annotations.Test;

public class TestNGTest4 {
	@Test (groups = {"Smoke","Regression"})
	public void test7() 
	{
		System.out.print("Smoke and Regression");
	}
@Test (groups = {"Smoke"})
	public void test6()
{
	System.out.print("Smoke");

}
@Test (groups = {"Regression"})
public void test8() 
{
System.out.print("Regresion");

}
}
