package interview.questions;

import java.util.HashMap;
import java.util.Map;

public class OccurencesOfEachCharacterInString {

	public static void main(String[] args) {
		getCharCount("Welcome to TekSchool !!!");
		
	}
	
	public static void getCharCount(String name) {
		
		Map<Character, Integer> chMap = new HashMap<Character, Integer>();
		
		char [] chArray = name.toCharArray();
		
		for (char ch : chArray) {
			
			if(chMap.containsKey(ch)) {
				
				chMap.put(ch,  chMap.get(ch)+1);
				
				
			}else {
				chMap.put(ch, 1);
			}
			
		}
		System.out.println(chMap);
	}
}
