package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics {
public static void main(String[] args) {
	
	WebDriverManager.edgedriver().setup();
	//	System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Eclipse\\Eclipse-Workspace\\Feb Batch\\LearnSelenium\\drivers\\chromedriver.exe");
	
	EdgeDriver driver = new EdgeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	WebElement elementUsername = driver.findElement(By.xpath("//input[@id='username']"));
	elementUsername.sendKeys("Demosalesmanager");
	WebElement elementPassword = driver.findElement(By.xpath("//input[@id='password']"));
	elementPassword.sendKeys("crmsfa");
	WebElement elementLoginButton = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
	elementLoginButton.click();
	WebElement elementCRMSFA = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
	elementCRMSFA.click();
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Bala");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("D");
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
}
}
