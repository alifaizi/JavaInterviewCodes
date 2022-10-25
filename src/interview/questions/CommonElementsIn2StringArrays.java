package interview.questions;

import java.util.HashSet;

public class CommonElementsIn2StringArrays {

	public static void main(String[] args) {

		// Finding common elements in two arrays

		String[] str1 = { "Ali", "Wali", "Sarah", "Smith", "Tom", "Claire", "David", "Robert" };
		String[] str2 = { "Matin", "Mahmood", "Claire", "Lord", "Sarah", "Wali", };

		HashSet hs = new HashSet();

		for (int i = 0; i < str1.length; i++) {
			hs.add(str1[i]);

		}

		for (int i = 0; i < str2.length; i++) {

			if (hs.contains(str2[i])) {

				System.out.println(str2[i] + " ---> is present in both arrays.");

			}
		}

	}

}
