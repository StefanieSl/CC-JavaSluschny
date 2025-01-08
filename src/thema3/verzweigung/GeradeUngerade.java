package thema3.verzweigung;

import java.util.Scanner;

public class GeradeUngerade {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl ein");
		int zahl = scanner.nextInt();

		int testdivision = zahl % 2;

		if (testdivision == 1) {
			System.out.println("Ungerade");
		} else {
			System.out.println("Gerade");
		}

		//*noch einfacher/kürzer:
		/*System.out.println((zahl % 2 == 1) ? "Ungerade" : "Gerade"));		
		*/		
		scanner.close();

	}

}
