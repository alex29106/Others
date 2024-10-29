package ProblemSet_8a;

import java.util.regex.Pattern;

public class Customer {
	private String name = null;
	private String surname = null;
	private static final String NAME_REGEX = "[A-Z][a-z]*";

	public Customer(String name, String surname) {
		if (validateInfo(name) && validateInfo(surname)) {
			this.name = name;
			this.surname = surname;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public char getName() {
		return name.charAt(0);
	}

	public boolean validateInfo(String info) {
		return Pattern.matches(NAME_REGEX, info);
	}

	public String toString() {
		return getName() + ". " + getSurname();
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}
