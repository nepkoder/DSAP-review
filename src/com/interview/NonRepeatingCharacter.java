package com.interview;

import java.util.HashMap;

public class NonRepeatingCharacter {
	
	public static void main(String[] args) {
		String text = "abcabbccded";
		
		char cha = 0;
		
		HashMap<Character, Integer> charCount = new HashMap<>();
		
//		System.out.println(text.toCharArray());
		
		for(char ch: text.toCharArray()) {
			if (charCount.containsKey(ch)) {
				int newVal = charCount.get(ch)+1;
				charCount.put(ch, newVal);
			} else {
				charCount.put(ch, 1);
			}
		}
		
		for(char ch: text.toCharArray()) {
			if (charCount.get(ch) == 1) {
				cha = ch;
			}
		}
		
		System.out.println("The non Repeating Character is " +cha);;
	}

}
