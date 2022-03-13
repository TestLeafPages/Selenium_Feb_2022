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

public class LearnAUI3 {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver = new EdgeDriver();
	driver.get("http://www.leafground.com/pages/selectable.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
	WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
	WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));

	Actions builder = new Actions(driver);
	builder.keyDown(Keys.CONTROL)
	.click(item1).click(item3).click(item5)
	.keyUp(Keys.CONTROL).perform();
}
}
