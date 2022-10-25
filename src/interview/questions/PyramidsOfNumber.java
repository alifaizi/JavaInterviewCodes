package interview.questions;

public class PyramidsOfNumber {

	public static void main(String[] args) {
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		  System.out.println("How many rows you want in your Pyramids?");
		    int row = 5;
		    for (int i = 1; i <= 5; i++) {
		      for (int j = 4; j >= i; j--) {
		        System.out.print(" ");
		      }
		      for(int k=1; k<=i;k++)
		      System.out.print(i+" ");
		      System.out.println();
		    }
		  }

	}


