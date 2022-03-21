package week5.day1;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class ProjectSpecificMethods {
	public RemoteWebDriver driver;
	public String excelFilePath;
	@Parameters({ "URL", "BROWSER_NAME" }) // This gets the value for the URL from the xml
	@BeforeMethod
	public void beforeMethod(String url, String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	@DataProvider(name = "Dynamic_Data")
	public String[][] testData() throws IOException {
		String[][] data = ReadExcel.getData(excelFilePath);
		return data;
	}
}

// username, password, cName, firstName, lastName
/*
 * 0 1 2 3 4 0|DemoSalesManager|crmsfa|company name 1|first name 1|last name 1|
 * 1|DemoSalesManager|crmsfa|company name 2|first name 2|last name 2|
 */
/*
 * String[][] data = new String[2][5]; // Row 1 data[0][0] = "DemoSalesManager";
 * data[0][1] = "crmsfa"; data[0][2] = "company name 1"; data[0][3] =
 * "first name 1"; data[0][4] = "last name 1"; // Row 2 data[1][0] =
 * "DemoSalesManager"; data[1][1] = "crmsfa"; data[1][2] = "company name 2";
 * data[1][3] = "first name 2"; data[1][4] = "last name 2";
 */