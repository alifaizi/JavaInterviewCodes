package interview.questions;

public class CuncurenceOfACharInString {

	public static void main(String[] args) {

		String str = "Nilab";
		char [] chArray = str.toCharArray();
		
		int count = 0;
		
		for (int i = 0; i < chArray.length; i++) {
			
			if(chArray[i]== 'N') {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
