package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver = new EdgeDriver();
	driver.get("http://www.leafground.com/pages/table.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	// Find the web table
	WebElement elementTable = driver.findElement(By.id("table_id"));
	
	// Finding the number of rows from the table found
	List<WebElement> rows = elementTable.findElements(By.tagName("tr"));
	System.out.println("Number of Rows: "+rows.size());
	
	// Finding the number of cols from the table row
	WebElement row = rows.get(1);
	List<WebElement> cols = row.findElements(By.tagName("td"));
	System.out.println("Number of Cols: "+ cols.size());
	
	
	for (int i = 1; i < rows.size(); i++) {
		WebElement eachRow = rows.get(i);
		WebElement tdColData = eachRow.findElements(By.tagName("td")).get(4);
		if(tdColData.getText().equals("Gopi")) {
			eachRow.findElements(By.xpath("//td/input")).get(2).click();
		}
	}
	
	
	
	
	
		/*
		 * for (int i = 1; i < rows.size(); i++) { 
		 * WebElement eachRow = rows.get(i);
		 * List<WebElement> allCols = eachRow.findElements(By.tagName("td")); 
		 * for (int j = 0; j < allCols.size(); j++) { 
		 * WebElement eachCol = allCols.get(j);
		 * System.out.println(eachCol.getText()); } }
		 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
