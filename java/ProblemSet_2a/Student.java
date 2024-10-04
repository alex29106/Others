package ProblemSet_2a;

public class Student {
	private String forename = null;
	private String surname = null;
	private int age = 0;
	public String getFullname() {
		return forename + " " + surname;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSurname() {
		return surname;
	}
	public String getForeName() {
		return forename;
	}
	public int getAge() {
		return age;
	}
	public Student(String forename, String surname, int age) {
		super();
		this.forename = forename;
		this.surname = surname;
		this.age = age;
	}
}
