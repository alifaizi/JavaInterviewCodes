package interview.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringElementInArray {

	public static void main(String[] args) {
		
		String [] strArray = {"Ali", "David", "Smith", "Sarah", "John", "Jenifer"};
		
		System.out.println(getReversedStringValues(strArray));

	}
	
	public static List<String> getReversedStringValues(String [] values){
		
		List<String> list = Arrays.asList(values);
		
		Collections.reverse(list);
		
		return list;
		
	}
	
	
	
	
}
