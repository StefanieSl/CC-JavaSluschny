package BMI_Rechner;

<<<<<<< HEAD
public class BMImScanner {
	
	public static void main(String[] args) {
		System.out.println("BMI Calculator");
		
		Scanner scanner = new Scanner(System.in);
		double weight = 80.5;
		double height = 1.75;
		
		double bmi = weight / (height * height);
		System.out.println("BMI is: " + bmi);
=======
import java.util.Scanner;

public class BMImScanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("** Welcome to my BMI Calculator ** ");

		System.out.println("Your weight: ");
		double weight = scanner.nextDouble();

		System.out.println("Your height: ");
		double height = scanner.nextDouble();

		double bmi = weight / (height * height);
		System.out.println("Your calculated BMI is: " + bmi);

		scanner.close();

>>>>>>> 1a9d5d4471db069fb603a317d9f180dacf512bf4
	}
}
