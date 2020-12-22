package com.java.datastructures;

public class SearchAlgo {

	public static void main(String[] args) {
		int[] inputArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int keyToSearch = 6;
		System.out.println("recursiveLinearSearch");
		int indexResult = recursiveLinearSearch(inputArray, 0, keyToSearch);
		
		if (indexResult == -1) {
			System.out.println(keyToSearch + " is not found");
		} else {
			System.out.println(keyToSearch + " is found at index: " + indexResult);
		}
		
		System.out.println("binarySearch");
		indexResult = binarySearch(inputArray, 0, inputArray.length-1,keyToSearch);
		
		if (indexResult == -1) {
			System.out.println(keyToSearch + " is not found");
		} else {
			System.out.println(keyToSearch + " is found at index: " + indexResult);
		}
	}

	public static int recursiveLinearSearch(int[] inputArray, int index, int keyToSearch) {
		if (index == inputArray.length) {
			return -1;
		} else if (inputArray[index] == keyToSearch) {
			return index;
		} else {
			return recursiveLinearSearch(inputArray, index + 1, keyToSearch);
		}
	}

	public static int binarySearch(int[] inputArray, int first, int last, int keyToSearch) {
		while (last >= first) {
			int mid = (first + last) / 2;
			if (inputArray[mid] == keyToSearch) {
				return mid;
			}
			if (inputArray[mid] < keyToSearch) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
			return binarySearch(inputArray, first, last, keyToSearch);
		}
		return -1;
	}

}
