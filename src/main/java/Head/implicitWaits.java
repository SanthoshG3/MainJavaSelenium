package Head;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class implicitWaits {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationtesting.co.uk/loader.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);      // Implicit wait ,waits works across the specific class,written only one time
		driver.findElement(By.xpath("//button[@id=\"loaderBtn\"]")).click();
		String Message = driver.findElement(By.xpath("//p[@id=\"p_wording\"]")).getText();
		
		Assert.assertEquals("And you have clicked the button!", Message);
		
		
	}

}
