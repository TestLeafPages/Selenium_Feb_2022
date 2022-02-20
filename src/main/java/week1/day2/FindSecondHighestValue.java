package week1.day2;

import java.util.Arrays;

public class FindSecondHighestValue {

	public static void main(String[] args) {
	
		int[] values = {10,20,30,70,50,90,40}; //index starts with 0 ; last item index will be length-1
		
		//step1: sort the array values
		Arrays.sort(values); // 10,20,20,40,50,70,90
		
		int indexOfSecondHghest = values.length-2;
		
		System.out.println(values[indexOfSecondHghest]);
		
		
	}

}
