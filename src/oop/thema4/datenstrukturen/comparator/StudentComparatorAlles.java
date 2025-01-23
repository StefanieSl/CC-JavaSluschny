package oop.thema4.datenstrukturen.comparator;

import java.util.Comparator;

public class StudentComparatorAlles implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		int nachnameVergleich = s1.getNachname().compareTo(s2.getNachname());
		 // =0 bedeutet, dass beide Objekte gleich sind (nach int-Wert der compare-Methode)	
		if (nachnameVergleich != 0) {
				return nachnameVergleich;
				}
		
		int vornameVergleich = s1.getVorname().compareTo(s2.getVorname());
			if (vornameVergleich != 0) {
				return vornameVergleich;
				}
		
		int ageVergleich = s1.getAge().compareTo(s2.getAge());
			if (ageVergleich != 0) {
				return ageVergleich;
				}
		
		return s1.getEmail().compareTo(s2.getEmail());
			
	}

}
