package Head;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newmainpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://automationtesting.co.uk/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/a[@class=\"toggle\"]")).click(); // by Xpath
		Thread.sleep(3000);
		driver.findElement(By.linkText("BUTTONS")).click();                 // by Link Text
		Thread.sleep(3000);
		driver.findElement(By.id("btn_one")).click();                       // by ID
		Thread.sleep(3000);
		driver.switchTo().alert().accept();                                 // Handel the Popup
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("DROPDOWN CHECKBOX RADIO")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//input[@id='cb_red']")).isSelected());
		
		
	}

}
