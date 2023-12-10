package properTestNGFormat;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;

	@BeforeSuite
	public void setup() throws InterruptedException, IOException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\santhog\\eclipse-workspace\\SeleNew\\src\\main\\java\\properTestNGFormat\\Properties");
		prop.load(file);
		if(prop.getProperty("browser").equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Driver\\chromedriver.exe");	
		driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").equals("edge"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Driver\\chromedriver.exe");	
		driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").equals("firefox"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Driver\\chromedriver.exe");	
		driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		Thread.sleep(3000);
	}
	@Test
	public void close()
	{
		driver.close();
	}



}
