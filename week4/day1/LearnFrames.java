package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver = new EdgeDriver();
	driver.get("https://jqueryui.com/selectable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	driver.switchTo().frame(5);
//	WebElement frameElement = driver.findElement(By.className("demo-frame"));
//	driver.switchTo().frame(frameElement);
	driver.findElement(By.xpath("//li[text()='Item 1']")).click();
	driver.switchTo().defaultContent();
	
	driver.findElement(By.linkText("Download")).click();
	
	
	
	
	
	
	
	
	
	
	
	
}
}
