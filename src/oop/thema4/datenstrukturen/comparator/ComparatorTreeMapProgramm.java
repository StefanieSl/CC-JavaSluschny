package oop.thema4.datenstrukturen.comparator;

import java.util.Collections;
import java.util.TreeMap;

public class ComparatorTreeMapProgramm {

	public static void main(String[] args) {
		
		// TreeMap mit benutzerdefinierten Comparatoren (Sortierung zuerst nach Nachname,
		// dann Vorname, dann Alter, dann E-Mail-Adresse)
		TreeMap<Student, String> studentMap = new TreeMap<>(new StudentComparatorAlles());
		
		studentMap.put(new Student("Ben", "Meier", "b.meier@blubuni.de", 20), "Englisch");
		studentMap.put(new Student("Lisa", "Berger", "l.berger@blubuni.de", 18), "Geschichte");
		studentMap.put(new Student("Anna", "Lewandowski", "annal@blubuni.de", 20), "Informatik");
		studentMap.put(new Student("John", "Sanders", "josa@blubuni.de", 20), "BWL");
		studentMap.put(new Student("Lisa", "Berger", "lisab@blubuni.de", 19), "Englisch");
		studentMap.put(new Student("Ben", "Meier", "ben.meier@blubuni.de", 23), "Asienwissenschaften");
		studentMap.put(new Student("Ali", "Urban", "aliurban@blubuni.de", 23), "Informatik");
		
		System.out.println("TreeMap mit Comparator - Sortierung nach allen Kriterien:");
		for (Student key : studentMap.keySet()) {
			System.out.println(key + "\t->\t" + studentMap.get(key));
		}
		
	}

}
