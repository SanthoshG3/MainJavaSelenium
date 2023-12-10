package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class Parameters1 {
	
	WebDriver driver;
	@BeforeSuite
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		System.out.print("Chrome opens Successfully");
	
	}
	
	@BeforeTest
	public void getintowebsite()
	{
		driver.get("http://teststore.automationtesting.co.uk/");
		System.out.print("Website opened Successfully");
	}
	
	@BeforeMethod
	
	public void setupwait()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.print("Given Implicity wait");
	}
	
	@Parameters({"login","password"})
	@Test
	
	public void login(String login, String password) throws InterruptedException
	{
		driver.findElement(By.xpath("//div/a[@title=\"Log in to your customer account\"]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div/input[@type='email']")).sendKeys(login);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/input[@type='password']")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='submit-login']")).click();
		Thread.sleep(1000);
		String ch =driver.findElement(By.xpath("//header/h1")).getText();
		if(ch.contains("Your account"))
		{
			System.out.println("The user has logged in");
		}
		else
		{
			System.out.println("The user has not logged in");
		}
	}
	
	@AfterMethod
	
	public void validateLogin()
	{
		String ch =driver.findElement(By.xpath("//header/h1")).getText();
		if(ch.contains("Your account"))
		{
			System.out.println("The user has logged in");
		}
		else
		{
			System.out.println("The user has not logged in");
		}
	}
	
	@AfterClass
	
	public void Logout()
	{
		driver.findElement(By.xpath("//a[@class=\"logout hidden-sm-down\"]")).click();
		System.out.print("Clicked on Signout");
	}
	
	@AfterTest
	
	public void validateLogot()
	{
		String logout = driver.findElement(By.xpath("//a//span[@class=\"hidden-sm-down\"]")).getText();
		
		if(logout.equals("Sign in"))
		{
			System.out.print("Sign Out Successfully");
		}
	}
	
	
	
	@AfterSuite
	public void close()
	{
		driver.close();
		driver.quit();
	}

}
