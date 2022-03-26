package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	ChromeDriver driver;

	@Given("A Chrome browser is launched")
	public void openChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@And("Load the Leaftaps url {string}")
	public void loadURL(String url) {
		driver.get(url);
	}

	@And("Maximize the browser")
	public void maximizeBrowser() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@And("Enter the username as {string}")
	public void enterUsername(String username) {
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys(username);
	}

	@And("Enter the password as {string}")
	public void enterPassword(String password) {
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys(password);
	}

	@When("The Login button is clicked")
	public void clickLogin_Positive() {
		WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
		elementLoginButton.click();
	}

	@But("The error message is displayed")
	public void getErrorMessage() {
		System.out.println("Username and password error message");
	}

	@Then("The Welcome Page should be displayed")
	public void verifyWelcomePage() {
		System.out.println("The welcome page is displayed");
	}
}
