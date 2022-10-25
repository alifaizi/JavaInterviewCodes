package interview.questions;

public class ExtractingCharFromNumbersInString {
	public static void main(String[] args) {
		
	String str = "wefeqf878979797fewfewrf879797efds&^&^^^";

	String textOnly = str.replaceAll("[^a-z]", "");

	System.out.println(textOnly.length());
	
}
}