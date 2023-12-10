package Head;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationtesting.co.uk/");
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class=\"toggle\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("POP UPS & ALERTS")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick=\"alertTrigger()\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept(); //Handels the Alert
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick=\"popup()\"]")).click();   // below handles Popups
		Thread.sleep(2000);
		String MainWindow =driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> Iterate = handles.iterator();
		
		
		while(Iterate.hasNext())
		{
			String child = Iterate.next();
			if(!MainWindow.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);
		
		
		
		
		

	}

}
