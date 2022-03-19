package week5.day1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnAttributes {
	/*
	 * @Test(invocationCount = 10) public void tc001() {
	 * System.out.println("Test case 001"); }
	 */
	
	/*
	 * @Test(invocationCount = 10, threadPoolSize = 5) public void tc001() {
	 * System.out.println("Test case 001"); }
	 */
	
	/*
	 * @Test(invocationCount = 5, invocationTimeOut = 3000) public void tc001()
	 * throws InterruptedException { Thread.sleep(2000);
	 * System.out.println("Test case 001"); }
	 */
	
	/*
	 * @Test(invocationCount = 5, timeOut = 1000 ) public void tc001() throws
	 * InterruptedException { Thread.sleep(2000);
	 * System.out.println("Test case 001"); }
	 */
	/*
	 * @Ignore
	 * 
	 * @Test() public void tc001() { System.out.println("Test case 001"); }
	 * 
	 * @Test(enabled = false) public void tc003() {
	 * System.out.println("Test case 003"); }
	 * 
	 * @Test(priority = -1) public void tc002() {
	 * System.out.println("Test case 002"); }
	 */
	
	@Test(dependsOnMethods = {"week5.day1.LearnAttributes.tc003"},alwaysRun = true)
	public void tc001()  {
		System.out.println("Test case 001");
	}
	
	@Test()
	public void tc003()  {
		System.out.println("Test case 003");
		throw new RuntimeException();
	}
	
	@Test(priority = -1)
	public void tc002()  {
		System.out.println("Test case 002");
	}
	
	@Test()
	public void tc004()  {
		System.out.println("Test case 004");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
