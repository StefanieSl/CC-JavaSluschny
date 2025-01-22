package oop.thema4.datenstrukturen.comparator;

import java.util.Comparator;

public class StudentComparatorAlter implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.age.compareTo(s2.age);
	}

}
