package oop.thema4.datenstrukturen.comparator;

import java.util.Comparator;

public class StudentComparatorNachname implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.nachname.compareTo(s2.nachname);
	}

}
