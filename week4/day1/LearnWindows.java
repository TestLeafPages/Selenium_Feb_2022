package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindows {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver = new EdgeDriver();
	driver.get("http://www.leafground.com/pages/Window.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	String currentWindowHandle = driver.getWindowHandle();
	System.out.println(currentWindowHandle);
	driver.findElement(By.id("home")).click();
	
	//Need to get all window references as a set
	Set<String> allWindowHandleSet = driver.getWindowHandles();
	
	// To get the unique value out of the Set, We are converting Set -> List
	List<String> allWindowHandleList = new ArrayList<String>();
	allWindowHandleList.addAll(allWindowHandleSet);
	
	// Get the unique reference from the list
	String newWindow = allWindowHandleList.get(1);
	
	// Switching to the new window
	driver.switchTo().window(newWindow);
	System.out.println(driver.getCurrentUrl());
	
	driver.switchTo().window(allWindowHandleList.get(0));
	System.out.println(driver.getCurrentUrl());
	
	
	
	
	
}
}
