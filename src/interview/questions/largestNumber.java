package interview.questions;

import java.util.Arrays;

public class largestNumber {

	public static void main(String[] args) {

		// Find the largest number in the array.
		
        int[] num = {2,3,65,34};
        
        Arrays.sort(num);
        
        System.out.println("Largest number: " + num[num.length-1]);
	}
}
