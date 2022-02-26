package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	//	System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Eclipse\\Eclipse-Workspace\\Feb Batch\\LearnSelenium\\drivers\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	WebElement elementUsername = driver.findElement(By.id("username"));
	elementUsername.sendKeys("Demosalesmanager");
	WebElement elementPassword = driver.findElement(By.id("password"));
	elementPassword.sendKeys("crmsfa");
	WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
	elementLoginButton.click();
	WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
	elementCRMSFA.click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bala");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("D");
	
	WebElement elementDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
//	elementDropdown.sendKeys("Employee");
	
	Select dd = new Select(elementDropdown);
	dd.selectByVisibleText("Employee");
	dd.selectByVisibleText("Employee");
	
	WebElement elementSelectedOption = dd.getFirstSelectedOption();
	System.out.println(elementSelectedOption.getText());
	
	List<WebElement> options = dd.getOptions();
	for (int i = 0; i < options.size(); i++) {
//		array[index] -> list.get(index)
		WebElement eachElement = options.get(i);
		System.out.println(eachElement.getText());
	}
//	dd.selectByIndex(2);
//	dd.selectByValue("LEAD_PR");
//	dd.selectByVisibleText("Employee");
	
	
	
	
	
	
	
	
	
//	driver.findElement(By.className("smallSubmit")).click();
}
}
