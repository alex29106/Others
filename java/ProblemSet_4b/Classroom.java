package ProblemSet_4b;

public class Classroom {
	private String room;
	private static int capacity = 20;
	private Student[] maxStudents;

	public Classroom(String room) {
		super();
		this.room = room;
		this.maxStudents = new Student[capacity];
	}

	public void addStudents(int inIndex, char inInitial, String inSurname) {
		maxStudents[inIndex] = new Student(inInitial, inSurname);
	}
	public String getRoom() {
		return room;
	}
	public int getCapacity() {
		return capacity;
	}
	public String getSummary() {
		String text = "";
		for (int i = 0; i < capacity; i++) {
			if (maxStudents[i] != null) {
				text += maxStudents[i].getStudentDetails()
					 + "\n";
			}
		}
		if (text == "") {
			return "No students added";
		} else {
			return text;
		}
	}
	public int howManyStudents() {
		int count = 0;
		for (int i = 0; i < capacity; i++) {
			if (maxStudents[i] != null) {
				count += 1;
			}
		}
		return count;
	}
}
