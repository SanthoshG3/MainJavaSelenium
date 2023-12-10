package Head;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class assertion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationtesting.co.uk/dropdown.html");
		String title = driver.getTitle();
		
	
		Assert.assertEquals("Dropdown Menus", title);      // to validate the elements available or not
		
		driver.findElement(By.xpath("//a[@class=\"toggle\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("HIDDEN ELEMENTS")).click();
		Thread.sleep(2000);
		System.out.print(driver.findElement(By.xpath("//div/div/p[2]")).isDisplayed());    // to find the hidden elements availble or not
		
		
	}

}
