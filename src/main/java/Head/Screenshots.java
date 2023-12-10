package Head;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://automationtesting.co.uk/");
		Thread.sleep(3000);
		takescreenshot(driver);
		
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
