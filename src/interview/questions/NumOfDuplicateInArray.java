package interview.questions;

import java.util.Arrays;

public class NumOfDuplicateInArray {
	
	public static void main(String[] args) {

		String [] str = { "test", "take", "nice", "pass", "test", "nice", "test" };
    
  countDuplicate(str);

  }
  public static void countDuplicate(String[] str){
  Arrays.sort(str);
    for (int i = 0; i < str.length; i++) {

      int count =0;
      for (int j = 0; j < str.length; j++) {
        if(str[i] == str[j]){
        count++;
        }else 
          continue;
}

      if(count>1){
    
   System.out.println(str[i] + " -> " + count);
        i+=(count-1);
  }
}
  }
}


