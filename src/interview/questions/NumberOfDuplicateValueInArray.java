package interview.questions;

public class NumberOfDuplicateValueInArray {

	public static void main(String[] args) {

		String [] data = {"test", "take", "nice", "pass", "test", "nice"};
		
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				
				if(data[i].equals(data[j])) {
					
					System.out.println(data[i] + " " + i + " " + j);
				}
				
			}
			
		}
		
		
	}

}
