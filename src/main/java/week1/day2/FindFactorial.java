package week1.day2;

public class FindFactorial {

	public static void main(String[] args) {
		int input = 5; // 1*2*3*4*5
		
		int fact  = 1 ;
		
		for (int i = 1; i <= input; i++) {
			
			fact = fact * i;
			
		}
		
		System.out.println(fact);
		
		

	}

}
