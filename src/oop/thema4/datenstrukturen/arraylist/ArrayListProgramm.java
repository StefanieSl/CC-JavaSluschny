package oop.thema4.datenstrukturen.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListProgramm {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();

		// FIFO: first in first out
		
		// 1. Möglichkeit:
//		list.add("A");
//		list.add("B");
//		list.add("C");
//		list.add("D");
		
		// 2. Möglichkeit:
		list = Arrays.asList("A", "B", "C", "D");
		
		System.out.println(list);
		
		System.out.println(list.get(2));
	}

}
