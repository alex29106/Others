package ProblemSet_8c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonTracker {
	private List<Person> peopleList;

	public PersonTracker() {
		peopleList = new ArrayList<Person>();
	}
	public String displayList() {
		StringBuilder text = new StringBuilder();
		for (Person person:peopleList) {
			text.append(person.toString());
			text.append("\n");
		}
		return text.toString();
	}
	private void breakLine(String line) {
		String[] values = line.split(" ");
		addPerson(values[0], values[1], Integer.valueOf(values[2]));
	}
	public void addPerson(String n, String s, int a) {
		peopleList.add(new Person(n, s, a));
	}
	public String readTextFile(String file) {
		try {
			StringBuilder text = new StringBuilder();
			Scanner reader = new Scanner(new File(file));
			while (reader.hasNextLine()) {
				breakLine(reader.nextLine());
			}
			return text.toString();
		} catch (NullPointerException e) {
			throw new NullPointerException();
		} catch (FileNotFoundException e) {
			return e.toString();
		}
	}

	public String getPeopleList() {
		return peopleList.toString();
	}
}
