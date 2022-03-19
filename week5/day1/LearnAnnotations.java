package week5.day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotations {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite - Config Environment");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test - Config Test execution Report");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class - Config Test data");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method - Open the browser");
	}
	@Test
	public void tc001() {
		System.out.println("Test case 1");
	}
	@Test
	public void tc002() {
		System.out.println("Test case 2");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method - close the browser");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After class - Close the test data");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test - Close report");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite - Close Env");
	}
}
