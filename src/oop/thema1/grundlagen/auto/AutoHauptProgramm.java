package oop.thema1.grundlagen.auto;

public class AutoHauptProgramm {

	public static void main(String[] args) {
		 
		Auto auto1 = new Auto("BMW", "X5", 2021);
		// auto1.fahren();
		
		Auto auto2 = new Auto("Mercedes", "AG15", 2024);
		// auto2.fahren();
		
		System.out.println(auto1.getMarke());
		auto1.setMarke("Audi");
		auto1.fahren();
		System.out.println(auto2.getMarke());
		auto2.fahren();
		
		System.out.println(Auto.ANZAHL_REIFEN);
		
		System.out.println(auto1);
		System.out.println(auto2);
	}
 
}

