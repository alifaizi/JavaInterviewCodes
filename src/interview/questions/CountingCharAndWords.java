package interview.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.HashMap;
public class CountingCharAndWords {

	public static void main(String[] args) {

		    String str = "This is a test of test";

		    Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		    char[] charArray = str.toCharArray();
		    for (char ch : charArray) {
		      if (charMap.containsKey(ch)) {
		        charMap.put(ch, charMap.get(ch) + 1);

		      } else {
		        charMap.put(ch, 1);
		      }

		    }
		    System.out.println("Counting Chars: " + charMap);

		    List<String> list = Arrays.asList(str.split(" "));
		    Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		    System.out.println("Counting Words: " + map);
		  }
		}
