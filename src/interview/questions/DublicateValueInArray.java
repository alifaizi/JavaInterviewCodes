package interview.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DublicateValueInArray {

	public static void main(String[] args) {

		String [] str = {"test", "java", "python", "c++", "java", "test"};
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length; i++) {
			sb.append(str[i].concat(" "));
		}
		String stringValue = sb.toString();
		
		System.out.println(stringValue);
		
		List<String> list = Arrays.asList(stringValue.split(" "));
		
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(map);
		
		System.out.println("====================================");
		
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				
				if(str[i].equals(str[j])) {
					
					System.out.println("Duplicate string is " + str[i] + " at " + i + " and " + j);
				}
					
			
				
				}
			}
		}
		
	}


