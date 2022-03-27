package testng;

import org.testng.annotations.Test;

public class LearnMoreGroups {
	
	@Test(groups="smoke")
	public void login() {
		System.out.println("Login");

	}

}
