package interview.questions;

public class AverageValueOfNumbersInArray {

	public static void main(String[] args) {


		// Find average of numbers in the array 
		
		double [] numbers = { 1, 65, 45, 56 };
		
		System.out.println(getAverage(numbers));

	}
	
	public static double getAverage(double [] numbers) {
		double sum = 0;
		double average = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum+=numbers[i];
			average = sum/numbers.length;
		}

		return average;
	}
	
}
