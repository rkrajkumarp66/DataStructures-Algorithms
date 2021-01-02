package com.java.datastructures.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class SubArrayWithZeroSum {
	public static void main(String[] args) {
		int[] inputArray = { 2,-1,2,-2,3,-3 };
		/*if (findSubArrZeroSum(inputArray)) {
			System.out.println("Input Array :" + Arrays.toString(inputArray) + " has zero prefix sum");
		} else {
			System.out.println("Input Array :" + Arrays.toString(inputArray) + " has no zero prefix sum");
		}*/
		findSubArrZeroSumWithMap(inputArray); 
	}

	public static boolean findSubArrZeroSum(int[] inputArray) {
		int arrSize = inputArray.length;
		int[] prefixSum = new int[inputArray.length];
		prefixSum[0] = inputArray[0];
		for (int i = 1; i < arrSize; i++) {
			prefixSum[i] = prefixSum[i - 1] + inputArray[i];
		}
		for (int l = 0; l < arrSize; l++) {
			for (int r = l; r < arrSize; r++) {
				int subArrSum = prefixSum[r] - prefixSum[l] + inputArray[l];
				if (subArrSum == 0) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean findSubArrZeroSumWithMap(int[] inputArray) {
		int arrSize = inputArray.length;
		int prefixSum = 0;
		HashMap<Integer, Integer> hMap = new HashMap<>();
		for (int i = 0; i < arrSize; i++) {
			prefixSum = prefixSum + inputArray[i];
			if(prefixSum==0) {
				System.out.println("Found Zero: [0"+","+i+"]");
				return true;
			}else {
				if (hMap.containsKey(prefixSum)) {
					System.out.println("Found Sub Array sum zero with Index: [" + (hMap.get(prefixSum) + 1) + "," + i + "]");
					System.out.println(hMap);
					return true;
				}
				hMap.put(prefixSum, i);
			}
		}
		
		return false;
	}
	
}
