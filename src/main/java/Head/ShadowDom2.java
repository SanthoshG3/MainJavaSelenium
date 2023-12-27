package Head;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom2 {
	
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://books-pwakit.appspot.com/explore");
	/*	jse.executeScript("document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"#input\").value='Book'");
	//	jse.executeScript("document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"app-header > app-toolbar.toolbar-bottom > book-input-decorator\").shadowRoot.querySelector(\"div.icon > svg\")[0].click();");
	//	String search = "document.querySelector(\"svg\")";
	//	String javascript = "arguments[0].click()"; 
	//	jse.executeScript(javascript,search);
		Thread.sleep(6000);
		jse.executeScript("document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"app-header > app-toolbar.toolbar-bottom > book-input-decorator\").shadowRoot.querySelector(\"div.icon\").click()"); */
		
		
		// Search a Book
		 
		WebElement PAll = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']"));
	    
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		SearchContext ShadowDom = (SearchContext) jse.executeScript("return arguments[0].shadowRoot", PAll);
		
		WebElement PHeader = ShadowDom.findElement(By.cssSelector("app-header[effects='waterfall']"));
		
		WebElement PToolbar = PHeader.findElement(By.cssSelector(".toolbar-bottom"));
		
		WebElement PInputdec = PToolbar.findElement(By.cssSelector("book-input-decorator"));
		
		PInputdec.findElement(By.cssSelector("#input")).sendKeys("Book");
		Thread.sleep(2000);
		
		// Click on Search 
		
		SearchContext ShadowDomSearch = (SearchContext) jse.executeScript("return arguments[0].shadowRoot",PInputdec );	
		
		ShadowDomSearch.findElement(By.cssSelector(".icon")).click();
		
		// Click ON Writing Book
		
		WebElement MainContent = ShadowDom.findElement(By.cssSelector(".main-content"));
		WebElement BookExplore = MainContent.findElement(By.cssSelector("book-explore[class='_page']"));
		
		SearchContext Explore = (SearchContext) jse.executeScript("return arguments[0].shadowRoot",BookExplore);
		
		WebElement Section = Explore.findElement(By.cssSelector("section"));
		//....
		WebElement UL = Section.findElement(By.cssSelector(".books"));
		WebElement Li = UL.findElement(By.cssSelector("section:nth-child(2) > ul:nth-child(1) > li:nth-child(1)"));
		
		WebElement BookItem = Li.findElement(By.cssSelector("section:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > book-item:nth-child(1)"));
		
		SearchContext BookI = (SearchContext) jse.executeScript("return arguments[0].shadowRoot",BookItem);
		Thread.sleep(4000);
		BookI.findElement(By.cssSelector("a[href='/detail/d999Z2KbZJYC']")).click();
		
	}

}

