package interview.questions;

public class DuplicateValueInAnArray {

	public static void main(String[] args) {

		
		// Find duplicate value in the array
		
		String [] str = {"Ali", "Faizi", "Tek", "School", "Ali", "Tek"};
		
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				
				if(str[i].equals(str[j])) {
				
					System.out.println(str[i] + " is duplicate at " + i + " and indexes " + j );
				}
				
			}
			
		}
		
	}

}
