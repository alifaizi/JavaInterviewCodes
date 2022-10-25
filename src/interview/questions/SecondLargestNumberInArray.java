package interview.questions;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {

		int [] numbers = {1, 3, 45, 56, 67, 78, 45, 634, 49};
		
		System.out.println("The second largest number in the in array is: " + getSecondLargest(numbers) );
	}
	public static int getSecondLargest(int [] numbers) {
		
		int largest = numbers[0];
		
		int secondLargest = numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			
			if ( largest < numbers[i]) {
				largest = numbers[i];
			}
			for (int j = 0; j < numbers.length; j++) {
				
				if(numbers[j] > secondLargest && numbers[j] < largest) {
					secondLargest = numbers[j];
				}
			}
		}
		return secondLargest;
	}
}
