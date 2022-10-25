package interview.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterCountsLamdaExpression {

	public static void main(String[] args) {
		
		String str = "Welcome to TekSchool !!!";
		char[] chArray = str.toCharArray();
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for (char c : chArray) {
			
		if (charMap.containsKey(c)){
			
				charMap.put(c, charMap.get(c)+1);
				
			}else {
				charMap.put(c, 1);
			}
		}
		charMap.entrySet().removeIf(i -> i.getValue()==1);
		
				System.out.println(charMap);
			}
		}
