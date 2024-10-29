package ProblemSet_8b;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Counting {
	public Counting() {
		super();
	}
	public String readTextFile(String file) {
		try {
			StringBuilder text = new StringBuilder();
			int count = 0;
			Scanner reader = new Scanner(new File(file));
			while (reader.hasNextLine()) {
				count++;
				text.append(displayLine(reader.nextLine(),
						count));
			}
			return text.toString();
		} catch (NullPointerException e) {
			throw new NullPointerException();
		} catch (FileNotFoundException e) {
			return e.toString();
		}
	}
	public String displayLine(String line, int counter) {
		return line + " : " + counter + "\n";
	}
}
