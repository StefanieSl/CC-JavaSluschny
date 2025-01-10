package thema5.arrays;

import java.util.Arrays;

public class ArraySwap {

	public static void main(String[] args) {
		
		int [] arr = {4, 2, 10, 3, -5, 0, 17};
		int index1 = 3;
		int index2 = 5;
		
		System.out.println("Vorher:");
		System.out.println(Arrays.toString(arr));
		
		swap(arr, index1, index2);
		
		System.out.println("Nachher:");
		System.out.println(Arrays.toString(arr));

	}

	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		
	}

}
