package interview.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterCountsInString {

	public static void main(String[] args) {
		
		String str = "Welcome to TekSchool !!!";

		duplicateCharacterCount(str);
	}
	
	public static void duplicateCharacterCount(String str) {
		if (str == null) {
			System.out.println("Null String");
			
			return;
		}
		if (str.isEmpty()) {
			System.out.println("Null is Empty");
			
			return;
	}
		if (str.length() == 1) {
			System.out.println("Single CHaracter String");
			return;
		}
		
		char[] chArray = str.toCharArray();
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (int i = 0; i < chArray.length; i++) {
			if (charMap.containsKey(chArray[i])){
				charMap.put(chArray[i], charMap.get(chArray[i])+1);
			}else {
				charMap.put(chArray[i], 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		
		for(Map.Entry<Character, Integer> entry: entrySet) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
	}
}
