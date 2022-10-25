package interview.questions;

public class SmallestNumberInArray {

	public static void main(String[] args) {

		
		int [] nums = {0, 1, 2, 4, 5, 7, 845, 89, 9, 8,67, 6, 64, 63, 5, 5, 23, 5, 23};
		
		System.out.println("The smallest number in array is: " + getSmallestNUmber(nums));
	}
	
	public static int getSmallestNUmber(int [] nums) {
		
		int smallestNum = nums[0];
		
		for (int i = 0; i < nums.length; i++) {
			
			if(smallestNum > nums[i]) {
				smallestNum = nums[i];
			}
			
		}
		
		
		
		return smallestNum;
	}
}
