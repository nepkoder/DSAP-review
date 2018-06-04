package com.search.binarysearch;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the items:");
		ArrayList<Integer> itemList = new ArrayList<>();
		// genearl for loop
		for(int i=0; i<itemList.size(); i++) {
			int item = scanner.nextInt();
			itemList.add(item);
		}
		System.out.println("list of items on the list are:");
		//enhanced for loop
		for(Integer temp: itemList) {
			System.out.println(temp);
		}
		
		int mid;
		while(!itemList.isEmpty()) {
//			mid = itemList.
		}
		
		
}
}
