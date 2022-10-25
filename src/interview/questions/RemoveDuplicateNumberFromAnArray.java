package interview.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumberFromAnArray {

	public static void main(String[] args) {

		int [] numArray = {1,1,2,2,2,3,3,4,5,6,8};

		  Set <Integer> hs = new HashSet <Integer>();
		  
		  for (int i = 0; i < numArray.length; i++) {
			  
			  hs.add(numArray[i]);
		}
		  Integer [] numArray2 = hs.toArray(new Integer[hs.size()]);
		  
		  System.out.println(Arrays.toString(numArray2));


	}

}
