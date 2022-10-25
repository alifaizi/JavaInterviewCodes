package interview.questions;

public class FailedTestCase {
	
	public static void main(String[] args) {
		
		String [][] testStatus = {{"tc001", "passed"},{"tc002", "failed"},{"tc003", "failed"}};
	
		for (int i = 0; i < testStatus.length; i++) {
			
			if(testStatus[i][1].equals("failed")) {
				
				System.out.println(testStatus[i][0] + " is " + testStatus[i][1]);
			}
			
		}
		
		
	}

}
