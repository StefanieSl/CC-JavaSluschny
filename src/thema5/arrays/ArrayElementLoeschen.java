package thema5.arrays;

public class ArrayElementLoeschen {

	public static void main(String[] args) {

		int [] arr = {3, 4, 1, 9, -5, 4};
		int elementToDelete = 9; //zu löschendes Element
		
		System.out.println("Feld: ");
		ArrayUtil.printArray(arr);
		
		System.out.println("Zu löschendes Element: " + elementToDelete);
		int [] modifiedArray = deleteArrayElement(arr, elementToDelete);

		ArrayUtil.printArray(modifiedArray);
	}

	private static int[] deleteArrayElement(int[] arr, int elementToDelete) {
		
		int index = -1; //um herauszufinden, ob das Element nicht gefunden wurde
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == elementToDelete) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			return arr;
		}
		
		for (int i = index; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		
		int[] newArray = new int [arr.length - 1];
		System.arraycopy(arr, 0, newArray, 0, newArray.length);
		
		return newArray;
	}

}
