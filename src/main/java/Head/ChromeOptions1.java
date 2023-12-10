package Head;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\Driver\\chromedriver.exe");
				
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--Start-maximized");
		WebDriver driver = new ChromeDriver(chrome);
		driver.get("https://automationtesting.co.uk/calculator.html");
		chrome.addArguments("--incognito");
		WebDriver driver1 = new ChromeDriver(chrome);
		
		driver1.get("https://automationtesting.co.uk/calculator.html");
	}

}
