package interview.questions;

public class MinimumUnSortedArray {

	public static void main(String[] args) {

		int [] numbers = {1, 45, 67, 98, 455, 678};
		
		int min = Integer.MAX_VALUE;
		for (int number : numbers) {
			if(number<min) {
				min=number;
			}
		}
		
		System.out.println(min);
	}
	
}