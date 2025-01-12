package thema5.arrays;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int [] feld1GeradeZahlen = new int [20];
		int [] feld2AufsteigendSortiert = new int [20];
		
		for (int i = 0; i < feld1GeradeZahlen.length; i++) {
			feld1GeradeZahlen[i] = (int) (Math.random() * 50) * 2;
			
			feld2AufsteigendSortiert[i] = (int) (Math.random() * 100);
		}
		
		Arrays.sort(feld2AufsteigendSortiert);
	
		System.out.print(Arrays.toString(feld1GeradeZahlen));
		System.out.println("");
		System.out.print(Arrays.toString(feld2AufsteigendSortiert));
		
		//Alternativ:
//		System.out.println(Arrays.toString(feld1GeradeZahlen));

	}

}
