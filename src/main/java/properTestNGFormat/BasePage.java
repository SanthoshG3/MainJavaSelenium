package properTestNGFormat;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	public static WebDriver driver ;
	public String url;
	private Properties prop;
	public BasePage() throws IOException
	{
		prop = new Properties();
	//	FileInputStream file = new FileInputStream("C:\\Users\\santhog\\eclipse-workspace\\SeleNew\\src\\main\\java\\properTestNGFormat\\Properties");
		
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir")+"\\src\\main\\java\\properTestNGFormat\\Properties");
		prop.load(file);
	}
	public WebDriver getdriver() throws IOException
	{
	    if(prop.getProperty("browser").equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\Source\\chromedriver.exe");	
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
		return driver;
	}
	
	public String url() throws IOException
	{
		url =prop.getProperty("url");
		return url;
	}
	public static void takescreenshot(WebDriver webdriver) throws IOException
	{
		File srcfile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		File desfile = new File("C:\\Eclipse\\Screenshots\\"+time()+".png");
		FileUtils.copyFile(srcfile, desfile);
	}
	public static String time() {
		return new SimpleDateFormat("YYY-MM-DD HH-MM-SS").format(new Date());
	}

}
