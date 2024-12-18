package BMI_Rechner;

public class BMImScanner {
	
	public static void main(String[] args) {
		System.out.println("BMI Calculator");
		
		Scanner scanner = new Scanner(System.in);
		double weight = 80.5;
		double height = 1.75;
		
		double bmi = weight / (height * height);
		System.out.println("BMI is: " + bmi);
	}
}
