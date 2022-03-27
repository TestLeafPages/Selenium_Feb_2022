package testng;

import org.testng.annotations.Test;

public class LearnGroups {

	@Test(groups = "smoke")
	public void createLead() {
		System.out.println("createLead");
	}

	@Test (groups = {"functional","regression"})
	public void editLead() {
		System.out.println("editLead");
	}

	@Test(groups = "functional")
	public void deleteLead() {
		System.out.println("deleteLead");
	}

	@Test(groups = "regression")
	public void duplicateLead() {
		System.out.println("duplicateLead");

	}

	@Test(groups = "functional")
	public void mergeLead() {
		System.out.println("mergeLead");

	}
}
