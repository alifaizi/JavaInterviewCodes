package interview.questions;

import java.util.Scanner;

public class CountingNumberOfWordsInString {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String str = scanner.nextLine();
		
		scanner.close();
		
		int count = 1;
		
		for (int i = 0; i < str.length()-1; i++) {
			
			if (str.charAt(i)== ' ' && (str.charAt(i+1)!= ' ')){
				
				count++;
			}
			
		}
			System.out.println(count);
	}

}
