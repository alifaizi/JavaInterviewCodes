package interview.questions;

public class SentenceInReverseOrder {

	public static void main(String[] args) {

		String sentence = "Welcome to TekSchool";
		
		System.out.println(sentence);
		
		String [] reverseSentence = sentence.split(" ");
		for (int i = reverseSentence.length -1; i >= 0; i--) {
			
			System.out.print(reverseSentence[i] + " ");
			
			
		}
		
	}

}
