package thema5.arrays;

public class SuchenArrayGroesste {

	public static void main(String[] args) {
		int [] zahlen = {3, 6, 14, 61, 2, 3};
		
		int max = findeGroesstesElement(zahlen);
		System.out.println("Max: " + max);
	}
	
	public static int findeGroesstesElement(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}
	

}
