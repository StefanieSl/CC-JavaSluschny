package oop.thema4.datenstrukturen.comparable;

import java.util.TreeMap;

public class ComparableTreeMapProgramm {

	public static void main(String[] args) {

		// TreeMap für Student (Name, Alter) und Studienfach
		TreeMap<Student, String> studentMap = new TreeMap<>();
		
		studentMap.put(new Student("Alice", 25), "Mathematik");
		studentMap.put(new Student("Bob", 22), "Physik");
		studentMap.put(new Student("Charlie", 28), "Informatik");
		
		System.out.println("TreeMap mit Comparable (Sortierung nach Alter)");
		for (Student key : studentMap.keySet()) {
			System.out.println(key + " -> " + studentMap.get(key));
		}

	}

}
