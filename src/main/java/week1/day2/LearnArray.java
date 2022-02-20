package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
	
		int[] values = {10,20,30,70,50,90,40}; //index starts with 0 ; last item index will be length-1
		
		//to get the number of items in an array
		System.out.println(values.length) ;
		
		//int[] values = new int[3]; //max limit = 3;
		
				
		//values[0] = 10;
		//values[1] = 20;
		//values[2] = 30;
		
		//values[3] = 40; //ArrayIndexOutOfBoundsException
		
		//to get the last item
		//System.out.println(values[values.length-1]);
		
		//10,20,30,40,50,70,90
		
		//to sort the data in ascending order
		Arrays.sort(values);
		
		
		//0,1,2,3,4,5,6
		for (int i = values.length-1; i >= 0; i--) {
			
			System.out.println(values[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
