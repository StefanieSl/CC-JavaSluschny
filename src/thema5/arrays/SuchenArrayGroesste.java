package thema5.arrays;

public class SuchenArrayGroesste {

	public static void main(String[] args) {
		int [] zahlen = {3, 6, 14, 61, 2, 61};
		
		int [] maxInfo = findeGroesstesElement(zahlen);
		System.out.println("Max: " + maxInfo[0] + ", Index: " + maxInfo[1]);

	}
	
	public static int[] findeGroesstesElement(int[] arr) {
		int max = arr[0];
		int index = 0; //Startindex
		
		for (int i = 1; i < arr.length; i++) { //Beginne bei 1, da arr[0]
			if(arr[i] > max) {
				max = arr[i];
				index = i;
			}			
		}

		return new int[] {max, index};

	}
	

}
