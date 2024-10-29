package ProblemSet_7c;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class StudentTracker {
	private ArrayList<Student> studentList;
	private HashMap<Integer, Student> moduleList;

	public StudentTracker() {
		studentList = new ArrayList<Student>();
		moduleList = new HashMap<Integer, Student>();
	}
	public String printStudents() {
		String text = "";
		for (Student student:studentList) {
			text += student.getName()
					+ "(" + student.getUrn() + ")\n";
		}
		return text;
	}
	public void addStudent(Student student, List<Module> moduleList) {
		studentList.add(student);
		for (Module module:moduleList) {
			student.addModuleList(module);
		}
	}
	private void initialiseMap() {
		moduleList.clear();
		for (Student student:studentList) {
			moduleList.put(student.getUrn(), student);
		}
	}
	public String printModules(int urn) {
		initialiseMap();
		return "URN " + urn + " is enrolled in:\n"
				+ moduleList.get(urn).printModules();
	}
}
