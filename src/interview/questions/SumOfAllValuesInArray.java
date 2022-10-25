package interview.questions;

public class SumOfAllValuesInArray {

	public static void main(String[] args) {

		// Find sum of all numbers in the array
		
		int[] numbers = { 1, 65, 45, 56, 67, 78, 45, 634, 49 };

		System.out.println(getSumOfAllValues(numbers));

	}
	
	public static int getSumOfAllValues(int [] numbers) {
		int sum = numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			sum+=numbers[i];
		}
		
		return sum;
	}
}
