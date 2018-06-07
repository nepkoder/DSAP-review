package com.interview;

import java.util.HashMap;

// most frequently occur item in array
public class TestQuestion1 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 1, 2, 1, 2, 2, 3, 2 };
		int maxCount = -1;
		int item = 0;

		HashMap<Integer, Integer> count = new HashMap<>();

		for (int i : arr) {
			if (count.containsKey(i)) {
				int val = count.get(i) + 1;
				count.put(i, val);
			} else {
				count.put(i, 1);
			}
			if (count.get(i) > maxCount) {
				maxCount = count.get(i);
				item = i;
			}
		}

		System.out.println("The Answer: " + item);

	}
}
