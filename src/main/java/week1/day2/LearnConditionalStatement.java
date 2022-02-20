package week1.day2;

//Shortcut key: type syso & cntrl+space
// for execution : cntrl + F11

public class LearnConditionalStatement {

	public static void main(String[] args) {
		int age  = 80;
		
		
		if(age < 18) {
			System.out.println("Minor");
		} else if (age >= 18 && age < 60) {
			System.out.println("Adult");
		}else if (age >= 60 && age < 80){
			System.out.println("Senoir Citizen");
		}else {
			System.out.println("Super senior citizen");
		}
		
		
		/*
		 * if(age < 18) { System.out.println("minor"); } else {
		 * System.out.println("major"); }
		 */
		
	//	System.out.println("End of the program");

	}

}
