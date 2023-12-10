package Head;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectUsingDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://automationtesting.co.uk/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("DROPDOWN CHECKBOX RADIO")).click();
		Thread.sleep(3000);
		
		
		Select vehicles = new Select(driver.findElement(By.xpath("//select[@id='cars']")));  // goes to the mail dropbox
		vehicles.selectByVisibleText("BMW");                                                 // selects the dropdown using visible text
		vehicles.selectByIndex(5);                                 // using index value
	}

}
