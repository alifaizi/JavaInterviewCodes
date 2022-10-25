package interview.questions;

import java.util.Scanner;

public class PrintAll3DigitsCombinationOfNumbersBetween1To5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the starting number");
		
		int start = scanner.nextInt();
		
		System.out.println("Enter the ending number");
		
		int end = scanner.nextInt();
		scanner.close();
		
		printNumbers(start, end);

	}
	 public static void printNumbers(int start, int end) {
		 int x = 0;
		 
		 for (int i = start; i <= end; i++) {
			 for (int j = start; j <= end; j++) {
				 
				 for (int k = start; k <= end; k++) {
					 
					 System.out.println(i + ", " + j + ", " + k);
					 
					x++;
				}
				
			}
			
		}
		 
		 System.out.println(x);
	 }
	 
	 
	
	}
