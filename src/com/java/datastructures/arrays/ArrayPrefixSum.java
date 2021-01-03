package com.java.datastructures.arrays;

import java.util.HashSet;

public class ArrayPrefixSum {

	public static void main(String[] args) {
		int[] inputArray = { 1, -2, 1, 4, 5 };
		int[] inputArray1 = { 2, -2, 3, 7, 6 };
		findArrPrefixSum(inputArray);
		if (findArrPrefixSumZeroNormal(inputArray)) {
			System.out.println("Found Prefix Sum Zero");
		} else {
			System.out.println("No Prefix Sum Zero");
		}
		
		findArrUnion(inputArray, inputArray1);
		findArrIntersection(inputArray, inputArray1);

	}

	public static void findArrPrefixSum(int[] inputArray) {
		int[] prefixSum = new int[inputArray.length];
		;
		prefixSum[0] = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + inputArray[i];
		}
		for (int i = 0; i < prefixSum.length; i++) {
			System.out.println(prefixSum[i] + " ");
		}
	}

	public static boolean findArrPrefixSumZeroNormal(int[] inputArray) {
		int[] prefixSum = new int[inputArray.length];
		;
		prefixSum[0] = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + inputArray[i];
			if (prefixSum[i] == 0)
				return true;
		}
		return false;
	}

	public static void findArrUnion(int[] inputArray, int[] inputArray1) {
		System.out.println("Creating Array Union");
		HashSet<Integer> hashSet = new HashSet<Integer>();

		for (int i : inputArray) {
			hashSet.add(i);
		}
		for (int i : inputArray1) {
			hashSet.add(i);
		}
		for (Integer i : hashSet) {
			System.out.println(i);
		}
	}

	public static void findArrIntersection(int[] inputArray, int[] inputArray1) {
		System.out.println("Creating Array Intersection");
		HashSet<Integer> hashSet = new HashSet<Integer>();

		for (int i : inputArray) {
			hashSet.add(i);
		}
		for (int i : inputArray1) {
			if(hashSet.contains(i)) {
				hashSet.remove(i);
				System.out.println(i);
			}
		}
	}

}
