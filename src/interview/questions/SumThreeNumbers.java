package interview.questions;

import java.util.Scanner;

public class SumThreeNumbers {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		
		int firstNumber = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		
		int secondNumber = scanner.nextInt();
		
		System.out.println("Enter third number: ");
		int thirdNumber = scanner.nextInt();
		
		
		System.out.println(getSumThreeNunbers(firstNumber, secondNumber, thirdNumber));
		
		scanner.close();
		
	}
	 public static int getSumThreeNunbers(int firstNumber, int secondNumber, int thirdNumber) {
		
		 return firstNumber+secondNumber+thirdNumber;
	 }
	
	}

