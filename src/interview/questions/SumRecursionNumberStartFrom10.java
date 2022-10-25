package interview.questions;

public class SumRecursionNumberStartFrom10 {
	

	    public static void main(String[] args) {
	        int number = 10;
	        int sum = addNumbers(number);
	        System.out.println("Sum = " + sum);
	    }

	    public static int addNumbers(int num) {
	        if (num != 0)
	            return num + addNumbers(num - 1);
	        else
	            return num;
	    }
	}
