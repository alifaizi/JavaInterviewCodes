package interview.questions;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateStringInArray {

	public static void main(String[] args) {
		
		String[] data = { "test", "take", "pass", "take", "David", "pass" };
		
		findDuplicateWord(data);
	}
	
	public static void findDuplicateWord(String [] data) {
		HashMap<String, Integer> hm = new HashMap<>();
		
		String myString = data.toString();
		
	String [] s = myString.split(" ");
	for (String newString : s){
		if(hm.get(newString) !=null) {
			hm.put(newString, hm.get(newString) + 1);
		}else {
			hm.put(newString, 1);
		}
	}
	Iterator<String> newString = hm.keySet().iterator();
	while(newString.hasNext()) {
		String temp = newString.next();
		if (hm.get(temp) >1) {
			System.out.println("the word " + temp + "appeared" + hm.get(temp) + "no of times");
		}
	}
}
}