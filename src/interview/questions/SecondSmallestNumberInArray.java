package interview.questions;

public class SecondSmallestNumberInArray {

	public static void main(String[] args) {

		int[] numbers = { 1, 65, 45, 56, 67, 78, 45, 634, 49 };

		System.out.println("The second smallest number in the in array is: " + getSecondSmallestNumber(numbers) );
	}
	
	public static int getSecondSmallestNumber(int [] numbers) {
		
		int smallest = numbers[0];
		int secondSmallest = Integer.MAX_VALUE;
		
		for (int i = 0; i < numbers.length; i++) {
			if (smallest > numbers[i]) {
				smallest = numbers[i];
			}
			
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] < secondSmallest && numbers[j] > smallest) {
					
					secondSmallest = numbers[j];
				}
			}
		}
		return secondSmallest;
		
		
		
	}

}
