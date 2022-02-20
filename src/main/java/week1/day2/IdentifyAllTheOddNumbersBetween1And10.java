package week1.day2;

public class IdentifyAllTheOddNumbersBetween1And10 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			
			if(i % 2 != 0 )
				System.out.println("Odd Numer: "+i);
			else
				System.out.println("Even Numer: "+i);
			
		}

	}

}
