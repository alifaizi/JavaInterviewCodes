package interview.questions;

import java.util.Scanner;

public class MethodWith3Number {

	  public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Enter first number: ");
	    int firstNumber = scanner.nextInt();

	    System.out.println("Enter second number: ");
	    int secondNumber = scanner.nextInt();

	    System.out.println("Enter third number: ");
	    int thirdNumber = scanner.nextInt();

	    scanner.close();

	    System.out.println(getValues(firstNumber, secondNumber, thirdNumber));

	  }

	  public static int getValues(int firstNumber, int secondNumber, int thirdNumber){

	    int sum = 0;
	    
	    if ((firstNumber + secondNumber + thirdNumber) != 10){
	    
	    }

	     return sum; 

	  }

	}

