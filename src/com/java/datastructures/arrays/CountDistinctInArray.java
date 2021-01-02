package com.java.datastructures.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctInArray {

	public static void main(String[] args) {
		int[] inputArray ={1,2,2,3,3};
		countDist(inputArray);

	}
	public static void countDist(int[] inputArray) {
		HashSet<Integer> hSet=new HashSet<Integer>();
		for(int i:inputArray) {
			hSet.add(i);
		}
		System.out.println("Distinct Elements count in Array: "+Arrays.toString(inputArray)+" is : "+hSet.size());
	}

}
