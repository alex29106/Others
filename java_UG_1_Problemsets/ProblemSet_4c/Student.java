package ProblemSet_4c;

public class Student {
	private char initial;
	private String surname;
	private Module[] modules;
	private static int maxModules = 8;
	private int totalScore = 0;
	private String text = "";

	public Student(char initial, String surname) {
		super();
		this.initial = initial;
		this.surname = surname;
		this.modules = new Module[maxModules];
	}

	public void setModules(int inIndex, String inCode, double inAverage) {
		modules[inIndex] = new Module(inCode, inAverage);
	}
	public int calculateYearAverage() {
		for (int i = 0; i < maxModules; i++) {
			totalScore += modules[i].getAverage();
		}
		return (int) totalScore / maxModules;
	}
	public String getStudentDetails() {
		return this.initial + ". " + this.surname
				+ " " + calculateYearAverage() + "%";
	}
	public Module getModules(int inIndex) {
		return modules[inIndex];
	}
	public String displayArray() {
		for (int i = 0; i < maxModules; i++) {
			text += modules[i].toString() + "\n";
		}
		text += "Year Average: " + calculateYearAverage() + "%";
		return text;
	}
}
