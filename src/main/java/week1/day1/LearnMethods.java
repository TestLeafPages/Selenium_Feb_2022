package week1.day1;

//standalone class
public class LearnMethods {

	public void printName() {
		System.out.println("Testleaf");
	}

	public long getMobileNumber() {
		long number = 9876543210L;
		return number; //to give output
	}

	public String getName() {
		return "Testleaf";
	}

	private int addTwoNumbers(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}

	public static void main(String[] args) {
		
		

		// ClassName objectName = new ClassName();

		LearnMethods obj = new LearnMethods(); // Constructor

		// objectName.methodName();
		obj.printName();
		
		long mobNum = obj.getMobileNumber(); //9876543210L
		System.out.println(mobNum);
		
		
		String name  = obj.getName();
		System.out.println(name);
		
		
		obj.addTwoNumbers(10, 20);
		
		
		
		
		
		

	}

}
