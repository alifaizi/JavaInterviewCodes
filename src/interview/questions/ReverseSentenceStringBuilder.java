package interview.questions;

public class ReverseSentenceStringBuilder {
	
	public static void main(String[] args) {
		
		String sentence = "Welcome to the World of Java!";
		
		StringBuilder sb = new StringBuilder(sentence);
		
		System.out.println(sb.reverse());
		
	}

}
