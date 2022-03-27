package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{
	
	@When("Click on {string} link")
	public void clickLink(String linkText) {
		System.out.println(driver);
		driver.findElement(By.linkText(linkText)).click();
		
	}

	@Then("{string} should be displayed")
	public void verifyPage(String pageText) {
		boolean displayed = driver.findElement(By.xpath("//div[text()='"+pageText+"']")).isDisplayed();
		System.out.println(displayed);
	}

}
