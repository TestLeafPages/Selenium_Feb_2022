package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAUI1 {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver = new EdgeDriver();
	driver.get("http://www.leafground.com/pages/drag.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement element = driver.findElement(By.id("draggable"));
	Point location = element.getLocation();
	int x = location.getX();
	int y = location.getY();
	Actions builder = new Actions(driver);
	builder.dragAndDropBy(element, x+100, y+100)
	.perform();
	
}
}
