package interview.questions;

public class RepetitiveCharacterInString {

	public static void main(String[] args) {

		// Finding the repetitive alphabet

		String text = "hello";
		
		int length = text.length();
		
		char[] ch = text.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			for (int j = i + 1; j < length; j++) {
				
				if (ch[i] == ch[j]) {
					
					System.out.println("Duplicate character is: " + ch[j]);

				}

			}
		}
	}
}
