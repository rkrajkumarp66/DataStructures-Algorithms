package com.java.datastructures.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// Anagrams: ["cider", "cried"]
		String s1 = "state";
		String s2 = "taste";
		if (checkAnagramNormal(s1, s2)) {
			System.out.println(s1 + " and " + s2 + " are Anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are not Anagrams");
		}
	}

	public static boolean checkAnagramNormal(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		boolean isCurrFound = false;
		for (int i = 0; i < s1.length(); i++) {
			char currChar = s1.charAt(i);

			for (int j = 0; j < s2.length(); j++) {
				if (s2.charAt(j) == currChar) {
					s2 = s2.replace(s2.charAt(j), '-');
					isCurrFound = true;
					break;
				}
			}
		}
		for (int j = 0; j < s2.length(); j++) {
			if (s2.charAt(j) != '-') {
				isCurrFound = false;
				break;
			}
		}
		return isCurrFound;

	}
	
	public static boolean checkAnagramSort(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
	
		/*// Sort both strings
        Arrays.sort(s1);
        Arrays.sort(s);
		//Arrays.sort(); 
*/		return false;
		
	}

}
