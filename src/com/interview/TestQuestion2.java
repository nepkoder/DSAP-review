package com.interview;

import java.util.ArrayList;

public class TestQuestion2 {

	// common element in two sorted array
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 6, 4, 5, 3 };
		int[] arr2 = { 2, 4, 3, 9, 6, 7, 8 };

		int p1 = 0;
		int p2 = 0;
		// int[] resultArr = new int[10];
		ArrayList<Integer> result = new ArrayList<>();
		while (p1 < arr1.length && p2 < arr2.length) {
			if (arr1[p1] == arr2[p2]) {
				result.add(arr1[p1]);
				p1++;
				p2++;
			} else if (arr1[p1] > arr2[p2]) {
				p2++;
			} else {
				p1++;
			}
		}

		for (int i=0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}

		// converting list into regular array form
		// Integer[] resultArray = new Integer[result.size()];
		// System.out.println(result.toArray(resultArray));
	}
}
