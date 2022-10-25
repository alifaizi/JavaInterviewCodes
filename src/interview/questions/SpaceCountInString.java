package interview.questions;

public class SpaceCountInString {

	public static void main(String[] args) {

		String sentence = "Welcome to tek school of America. It is your home";
		
		int space = 0;
		
		for (int i = 0; i < sentence.length(); i++) {
			
			char ch = sentence.charAt(i);
			
			if (ch == ' ') {
			
				space++;
			
			}
			
		}
		
		System.out.println(space);

	}

}
