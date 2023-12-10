package easyJet;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchSection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.easyjet.com/en/");
		
		driver.findElement(By.xpath("//button[@id=\"ensCloseBanner\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"origin\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"origin\"]")).sendKeys("London");
		
		Thread.sleep(2000);
		
	//	List<WebElement> from = driver.findElements(By.xpath("//li//ul//a/span"));
	
		List<WebElement> from = new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li//ul//a/span")));
		for(WebElement desti :from)
		{
			if(desti.getText().contains("Luton"))
			{
				desti.click();
			}
		}
		
		driver.findElement(By.xpath("//input[@name=\"destination\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"destination\"]")).sendKeys("A");
		
		List<WebElement> to = new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@id=\"ui-id-2\"]//li/a/span")));
		
		for(WebElement towards : to)
		{
			if(towards.getText().contains("Aberdeen"))
			{
				towards.click();
			}
		}
	}
	

}
