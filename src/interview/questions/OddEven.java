package interview.questions;

import java.util.Scanner;

public class OddEven {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number: ");
		
		int numbers = sc.nextInt();
		
		if(numbers % 2 == 0) {	
			
		System.out.println("Number is even");
		
		}else {
			System.out.println("Number is odd");
		}

	}

}
