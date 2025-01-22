package oop.thema4.datenstrukturen.comparator;

public class Student {

	protected String vorname;
	protected String nachname;
	protected String email;
	protected Integer age;

	public Student(String vorname, String nachname, String email, int age) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.email = email;
		this.age = age;
	}

	@Override
	public String toString() {
		return vorname + " " + nachname + " (" + age + ")" + ", E-Mail: " + email;
	}

}
