package interview.questions;

public class LargestNumberInArray {

	public static void main(String[] args) {

		int [] nums = {2, 65, 5, 23};
		
		System.out.println("The largest number in array is: " + getLargest(nums));
		}
	
	public static int getLargest(int [] nums) {
		int largest = nums[0];
		
		for (int i = 0; i < nums.length; i++) {
			if (largest < nums[i]) {
				largest = nums[i];
				
			}
		}
		
		
		
		return largest;
		
	}
	
	
}

