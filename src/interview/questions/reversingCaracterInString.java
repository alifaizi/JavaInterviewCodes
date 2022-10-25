package interview.questions;

public class reversingCaracterInString {

	public static void main(String[] args) {

		String sentence = " Welcome to the World of Java!";

	char [] chArray = sentence.toCharArray();
	
	for (int i = chArray.length -1; i>0; i--) {
		
		System.out.print(chArray[i]);
	}
	}
}