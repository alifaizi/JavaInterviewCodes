package interview.questions;

public class DuplicateInArray {

	public static void main(String[] args) {

		String[] data = { "test", "take", "pass", "take", "David", "pass" };
		
		for (int i = 0; i < data.length; i++) {
			
			for (int j = i + 1; j < data.length; j++) {
				
				if (data[i].equals(data[j])) {
					
					System.out.println(data[i] + " is reptited at index " + i + " and index " + j);

				}
			}
		}

	}

}
