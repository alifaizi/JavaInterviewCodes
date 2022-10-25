package interview.questions;

import java.util.ArrayList;
import java.util.List;

public class GetValueFromArrayList {

	// use list to store below vlaue in array and print index 1
	// "Tek", "School", "of", "America"
	
	public static void main(String[] args) {
		
		List<String> str = new ArrayList<String>();
		
		str.add(0, "Tek");
		str.add(1, "School");
		str.add(2, "of");
		str.add(3, "America");
		for (int i = 0; i < str.size(); i++) {
		}
		System.out.println(str.get(1));
	}
}
