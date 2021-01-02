package com.java.datastructures.general;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println(isPrime1(5));
		System.out.println(isPrime2(5));
		System.out.println(isPrime3(5));
	}

	public static boolean isPrime1(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isPrime2(int num) {
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isPrime3(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
