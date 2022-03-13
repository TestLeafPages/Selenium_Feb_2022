package week4.day2;

import org.openqa.selenium.NoSuchElementException;

public class LearnExceptionHandling {
public static void main(String[] args) throws InterruptedException  {
	// try -> catch
	// try -> finally
	// try -> catch -> finally
	try {
	System.out.println(4/2);
	throw new NoSuchElementException("");
	}
	catch(NoSuchElementException e) {
		System.out.println(e);
	} 

	catch(Exception e) {
		System.out.println(e);
	} 
	new LearnExceptionHandling().throwException();
}

public void throwException() throws InterruptedException {
	Thread.sleep(2000);
}
}
