package interview.questions;

import java.util.Arrays;

public class AddingNumberInArrayAndReplaceOneNumber {

	public static void main(String[] args) {

		int[] numbers = new int[3];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		System.out.println(Arrays.toString(numbers));
		numbers[2] = 30;
		System.out.println(Arrays.toString(numbers));
	}
}
