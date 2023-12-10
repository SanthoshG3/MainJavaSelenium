package Head;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationtesting.co.uk/iframes.html");
		WebElement strin = driver.findElement(By.xpath("//iframe[@src=\"index.html\"]"));
		driver.switchTo().frame(strin);
		
		driver.findElement(By.xpath("//a[@class=\"toggle\"]")).click();
		driver.findElement(By.xpath("//a[@class=\"toggle\"]")).click();
		driver.switchTo().parentFrame();
		
		// driver.findElement(By.xpath("//a[@class=\"toggle\"]")).click();
		 driver.switchTo().frame(1);
		String URL = driver.findElement(By.xpath("//table//tbody//tr[2]//td[2]")).getText();
		System.out.print(URL);

	}

}
