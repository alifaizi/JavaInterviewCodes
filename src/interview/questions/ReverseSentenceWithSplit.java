package interview.questions;

public class ReverseSentenceWithSplit {

	public static void main(String[] args) {

		String sentence = "Welcome to the World of Java!";

		String[] reversedSentence = sentence.split(" ");

		for (int i = reversedSentence.length - 1; i > 0; i--) {

			System.out.print(reversedSentence[i] + " ");
		}
	
}
}