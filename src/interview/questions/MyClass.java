package interview.questions;

import java.util.HashMap;
import java.util.Map;

public class MyClass {

	private Map map;
	
	public MyClass() {
		map = new HashMap<>();
		map.put("foo", 1);
		map.put("bar", 3);

	}
	
	public int getValue (String input, int numRetries) throws Exception{
		
		try{
			return (int) map.get(input);
		}
		
		catch (Exception e) {
			if(numRetries > 3) {
				throw e;
			}
		}
		
		return getValue(input, numRetries + 1);
	}
	
}
