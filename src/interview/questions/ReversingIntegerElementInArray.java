package interview.questions;


public class ReversingIntegerElementInArray {

	public static void main(String[] args) {

		int[] numArray = { 10, 20, 30, 40, 50, 60 };

		int begin = 0;
		int end = numArray.length - 1;

		while (begin < end) {
			int temp = numArray[begin];
			numArray[begin] = numArray[end];
			numArray[end] = temp;

			begin++;
			end--;
		}
		for (int array : numArray) {
			System.out.println(array);
		}
	}

}
