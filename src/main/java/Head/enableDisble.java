package Head;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class enableDisble {

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
		System.out.println(driver.findElement(By.xpath("//input[@id='cb_red']")).isSelected());       // Selected or not
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//input[@id='cb_green']")).isSelected());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for=\"cb_blue\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("BUTTONS")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//button[@id=\"btn_four\"]")).isEnabled());     // button enabled or not
		driver.close();
		
		
		
	}

}
