package oop.thema4.datenstrukturen.comparator;

public class Student {

	private String vorname;
	private String nachname;
	private String email;
	private Integer age;

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

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public String getEmail() {
		return email;
	}

	public Integer getAge() {
		return age;
	}

	
}
