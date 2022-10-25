package interview.questions;


public class ReverseCharactersInStringArrayWithScanner {
	
	public static void main(String[] args) {
		
		String str = " Reverse String";
		
		char [] chArray = str.toCharArray();
		
		for (int i = chArray.length-1; i>0; i--) {
			
			System.out.print(chArray[i]);
			
		}
	}

}
