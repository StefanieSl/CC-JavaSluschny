package thema5.arrays;

public class ArrayProgramm {

	public static void main(String[] args) {

		int [] ages = new int[5];
		ages[0] = 12;
		ages[1] = 22;
		ages[2] = 2;
		ages[3] = 30;
		ages[4] = 50;
		
		// Werte des Arrays ausgeben:
		for(int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		
		// Alternative - speichern des Wertes jeweils in eine neue Variable alter:
		for(int alter : ages) {
			System.out.println(alter);
		}
		
		// String-Array:
		String [] names;
		names = new String[2];
		names[0] = "Timo";
		names[1] = "Toni";
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
