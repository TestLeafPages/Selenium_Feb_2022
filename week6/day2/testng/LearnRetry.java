package testng;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnRetry {

	@Test
	public void createLead() {
		System.out.println("createLead");
		throw new NoSuchElementException();
	}

	@Test
	public void editLead() {
		System.out.println("editLead");
		
	}

	@Test
	public void deleteLead() {
		System.out.println("deleteLead");
	}

	
}
