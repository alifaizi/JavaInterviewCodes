package interview.questions;

public class RemoveSpacesInString {

	public static void main(String[] args) {
		
	   

		String str = "Welcome to Java World";

		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				System.out.print(ch[i]);
			}
		}
		System.out.println("\n---------------------");
		
		String replaced = str.replace(" ", "");
		System.out.println(replaced);
		
		System.out.println("-----------------------------");
		
		 String removeAgain = str.replaceAll("\\s", "").trim();
		 System.out.println(removeAgain);
	}
   
}

