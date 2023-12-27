package Head;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class HandlingTables {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int i = 0;
		driver.get("https://letcode.in/table");
		String st;
		String list = "//table[@id=\"simpletable\"]//tbody//tr['"+i+"']";
		
		List<WebElement> li = driver.findElements(By.xpath(list));
		List<WebElement> li2 = driver.findElements(By.xpath("//table[@id=\"simpletable\"]//tbody//tr['"+i+"']//td"));
		 
		// getting text on table
	/*	for(WebElement tr : li)
		{
			for(WebElement td :li2)
			{
				
				String values = td.getText();
				System.out.println(values);
			}
		}
	
		
	for(WebElement tr : li)
	{
		
		for(WebElement td :li2)
		{
			i = 1;
			String values = td.getText().trim();
			System.out.println(values);
				if(values.equals("Raj"))
			{
				System.out.println("Inside if");
				tr.findElement(By.xpath(checkboxstr)).click();
		    }
				else if(i>=3)
				{
					break;
				}
				++i;	
			
	}
		
		++i;
		
}
*/        // To select the check box of a specific name
		List <WebElement> Row = driver.findElements(By.xpath("//table[@id=\"simpletable\"]//tbody//tr"));
		int rowCount = Row.size();
		System.out.println("Row Size :"+ rowCount);
		List<WebElement> Column = driver.findElements(By.xpath("//table[@id=\"simpletable\"]//tbody//tr[1]//td"));
		int columnCount = Column.size();
		System.out.println("Column Size :"+ columnCount);
		String checkboxstr = "//td[4]//input";
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		 
		for(int j =1;j<=rowCount;j++)
		{
			for(int k =1;k<=columnCount;k++)
			{
				System.out.println("J is"+j);
				System.out.println("K is"+k);
				//jsExecutor.executeScript("arguments[0].style.border='2px solid red'","//table[@id=\"simpletable\"]/tbody/tr['"+j+"']/td['"+k+"']" );
			String Name = driver.findElement(By.xpath("//table[@id=\"simpletable\"]/tbody/tr["+j+"]/td["+k+"]")).getText();
			System.out.println(Name);
			 if(Name.equals("Yashwanth"))
			 {
				System.out.println("Inside If");
				driver.findElement(By.xpath("//table[@id=\"simpletable\"]//tbody//tr["+j+"]//td[4]//input")).click();
			 }
		    }
       }
		// or use //table[@id="simpletable"]/tbody/tr/td[text()="Iron"]/following-sibling::td/input xpath 
		
		// get the numbers , add and validate the total 
		int Total = 0;
		List<WebElement> Tableprice = driver.findElements(By.xpath("//table[@id=\"shopping\"]//tbody/tr/td[2]"));

		int priceCount = Tableprice.size();
		for(WebElement price : Tableprice) {
			String value = price.getText();
			int cost = Integer.parseInt(value);
			System.out.println("/n costs are" + cost);
			Total += cost;
		}
		System.out.println("Total calculated = " + Total);
		
		String TablePrice = driver.findElement(By.xpath("//table[@id=\"shopping\"]//tfoot/td/b")).getText();
		int TableCose = Integer.parseInt(TablePrice);
		Assert.assertEquals("Same Price Expected", Total, TableCose);
	}
	
	
}