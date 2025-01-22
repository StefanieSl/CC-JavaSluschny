package oop.thema4.datenstrukturen.comparator;

import java.util.Comparator;

public class StudentComparatorEmail implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getEmail().compareTo(s2.getEmail());
	}

}
