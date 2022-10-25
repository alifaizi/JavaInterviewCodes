package interview.questions;

import java.util.HashSet;

public class CommonValueIn2Arrays {

	public static void main(String[] args) {
		
		int [] num1 = {1, 2, 3, 4, 5, 6};
		int [] num2 = {1, 7, 3, 8, 5, 8};


		HashSet hs = new HashSet();
		for (int i = 0; i < num1.length; i++) {
			hs.add(num1[i]);
		}
		
		for (int i = 0; i < num2.length; i++) {
			if(hs.contains(num2[i])) {
				
				System.out.print(num2[i]);
			}
		}
		
	}
}
	
