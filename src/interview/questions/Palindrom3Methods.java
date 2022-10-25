package interview.questions;

public class Palindrom3Methods {

	public static void main(String[] args) {
		
		String str = "rotor";

		System.out.println("Is palindrom: " + isPalindrom1(str));
		System.out.println("Is palindrom method: " + isPalindrom2(str));
		System.out.println("Is palindrom method: " + isPalindrom3(str) );
	}

	public static boolean isPalindrom1(String str) {
		StringBuilder sb = new StringBuilder(str);
		return str.equals(String.valueOf(sb.reverse()));
		
	}
	
	public static boolean isPalindrom2(String str) {
		String reverse = "";
		for (int i = str.length()-1; i>=0; i--) {
			
			reverse += str.charAt(i);
		}
		return str.endsWith(reverse);
	}
	
	public static boolean isPalindrom3(String str) {
		
		for (int fwd = 0, bck = str.length() -1; fwd < str.length(); fwd++, bck--) {
			
			if(fwd == bck || fwd > bck) {
				
				return true;
				
			}else if(str.charAt(fwd) == str.charAt(bck)) {
				
				continue;
			}
			
			return false;
			
		}
		
		return true;
	}
	
}
