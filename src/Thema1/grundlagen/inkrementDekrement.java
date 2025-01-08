package Thema1.grundlagen;

public class inkrementDekrement {

	public static void main(String[] args) {
		
		int i = 0 ; int n = i++;
		System.out.println("A : i = " + i + " n = " + n);
		
		i = 10 ; n = ++i;
		System.out.println("B : i = " + i + " n = " + n);
		
		i = 20; int j = 5 ; n = i++ * ++j;
		System.out.println("C : i = " + i + " j = " + j + " n = " + n);
		
		i = 15; n = i += 3;
		System.out.println("D : i = " + i + " n = " + n);
		
		i = 3; j = 5; n = i * --j;
		System.out.println("E : i = " + i + " j = " + j + " n = " + n);

	}

}
