package interview.questions;

public class Palindrome {

	public static void main(String[] args) {

		String word = "dad";

		System.out.println("Is the word palindrome: " + isPalindrome(word) );
	}

	public static boolean isPalindrome(String word){
		
		for (int fwd = 0, bck = word.length()-1; fwd < word.length(); fwd++, bck--) {
			
			if(fwd == bck || fwd > bck) {
				
				return true;
			}else if(word.charAt(fwd) == word.charAt(bck)) {
				
				continue;
			}
			
			return false;
		}

		return true;
	}
}
