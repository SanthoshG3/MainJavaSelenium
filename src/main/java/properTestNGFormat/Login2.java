package properTestNGFormat;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
@Test
public class Login2 extends BasePage{
	
	public Login2() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void login() throws IOException, InterruptedException
	{
		
		
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\santhog\\eclipse-workspace\\SeleNew\\src\\main\\java\\properTestNGFormat\\Properties");
		prop.load(file);
		driver = getdriver();
		driver.get(url());
		driver.findElement(By.xpath("//div/a[@title=\"Log in to your customer account\"]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div/input[@type='email']")).sendKeys(prop.getProperty("email"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/input[@type='password']")).sendKeys(prop.getProperty("password"));
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
		takescreenshot(driver);
	}
	
}
