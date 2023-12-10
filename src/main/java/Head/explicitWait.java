package Head;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class explicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationtesting.co.uk/loader.html");
		
		WebDriverWait wait = new WebDriverWait(driver , 10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"loaderBtn\"]")));    // Giving enough time for specific item only
		driver.findElement(By.xpath("//button[@id=\"loaderBtn\"]")).click();
		String Message = driver.findElement(By.xpath("//p[@id=\"p_wording\"]")).getText();
		
		Assert.assertEquals("And you have clicked the button!", Message);
		
		
	}

}
