package Head;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTabs {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://automationtesting.co.uk/browserTabs.html");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		ArrayList<String> Tabid = new ArrayList<String>(driver.getWindowHandles());
		
		System.out.print("Total No of Tab is"+ Tabid.size());
		
		for(String Tabs : Tabid)
		{
			Thread.sleep(1000);
			System.out.println(driver.switchTo().window(Tabs));
		}
		
		driver.switchTo().window(Tabid.get(0));
		
		
		
		
	}

}
