package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFindElements {
public static void main(String[] args) {

	WebDriverManager.edgedriver().setup();
	//	System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Eclipse\\Eclipse-Workspace\\Feb Batch\\LearnSelenium\\drivers\\chromedriver.exe");
	
	EdgeDriver driver = new EdgeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.id("twotabsearchtextbox123")).sendKeys("iphone",Keys.ENTER);
	
	List<WebElement> mobileNameElements = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal123']"));
	for (int i = 0; i < mobileNameElements.size(); i++) {
		System.out.println(mobileNameElements.get(i).getText());
	}

}
}
