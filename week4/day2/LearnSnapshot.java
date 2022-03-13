package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSnapshot {
public static void main(String[] args) throws IOException  {
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver = new EdgeDriver();
	driver.get("http://www.leafground.com/pages/drag.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement element = driver.findElement(By.id("draggable"));
	
	// Taking snap shot
//	File screenShot = driver.getScreenshotAs(OutputType.FILE);
	File screenShot = element.getScreenshotAs(OutputType.FILE);
	// Create an image file to store the screen shot
	File image = new File("./snaps/img002.jpg");
	// Merging temp screenshot and image file togeather
	FileUtils.copyFile(screenShot, image);
	
}
}
