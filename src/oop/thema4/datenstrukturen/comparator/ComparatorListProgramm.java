package oop.thema4.datenstrukturen.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorListProgramm {

	public static void main(String[] args) {

		// Liste mit benutzerdefinierten Comparatoren (Sortierung zuerst nach Nachname,
		// dann Vorname, dann Alter, dann E-Mail-Adresse)
		List<Student> studentList = new ArrayList<>();

		studentList.add(new Student("Ben", "Meier", "b.meier@blubuni.de", 20));
		studentList.add(new Student("Lisa", "Berger", "l.berger@blubuni.de", 18));
		studentList.add(new Student("Anna", "Lewandowski", "annal@blubuni.de", 20));
		studentList.add(new Student("John", "Sanders", "josa@blubuni.de", 20));
		studentList.add(new Student("Lisa", "Berger", "lisab@blubuni.de", 19));
		studentList.add(new Student("Ben", "Meier", "ben.meier@blubuni.de", 23));
		studentList.add(new Student("Ali", "Urban", "aliurban@blubuni.de", 23));

		Collections.sort(studentList, new StudentComparatorNachname());
		Collections.sort(studentList, new StudentComparatorNachname());
		System.out.println(studentList);
	}

}
