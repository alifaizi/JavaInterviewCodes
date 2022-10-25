package interview.questions;

public class MaximumUnSortedArray {

	public static void main(String[] args) {

		int [] numbers = {1, 45, 67, 98, 455, 678};
		
		int max = Integer.MIN_VALUE;
		for (int number : numbers) {
			if(number>max) {
				max=number;
			}
		}
		
		System.out.println(max);
	}
	
}