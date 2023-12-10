package Head;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageCookies {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://teststore.automationtesting.co.uk/");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div/a[@title=\"Log in to your customer account\"]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div/input[@type='email']")).sendKeys("teststore@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/input[@type='password']")).sendKeys("teststore@gmail.com");
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
		
		driver.findElement(By.xpath("//li[@id=\"category-3\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a//img[@alt=\"Hummingbird printed t-shirt\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-button-action=\"add-to-cart\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-secondary\"]")).click();
		
		driver.manage().deleteAllCookies();
		
		
	}

}
