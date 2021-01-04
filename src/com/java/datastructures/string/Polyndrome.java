package com.java.datastructures.string;

import java.util.Arrays;

public class Polyndrome {

	public static void main(String[] args) {
		String inputString = "geeg";
		if(checkPolyndrome(inputString)) {
			System.out.println(inputString+" is a polyndrome");
		}else {
			System.out.println(inputString+" is not a polyndrome");
		}

	}
	public static boolean checkPolyndrome(String inputString) {
		int n = inputString.length();
		for(int i=0;i<n/2;i++) {
			if(inputString.charAt(i)!=inputString.charAt(n-i-1)) {
				return false;
			}
		}
		return true;
		
	}

}
