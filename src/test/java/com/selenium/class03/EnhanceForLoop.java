package com.selenium.class03;

import java.util.ArrayList;
import java.util.List;

public class EnhanceForLoop {
	public static void main(String[] args) {

		int a[] = { 12, 45, 32, 67, 44 };

		// Generic
		List<Integer> listOfData = new ArrayList<Integer>();

		listOfData.add(12);
		listOfData.add(45);
		listOfData.add(32);
		listOfData.add(67);
		listOfData.add(44);

		for (int i = 0; i < listOfData.size(); i++) {
			System.out.println(listOfData.get(i));
		}

		for (int data : listOfData) {
			System.out.println(data);
		}

	}
}
