package ProblemSet_7b;

import java.util.regex.Pattern;

public class Module {
	private String name = null;
	private static final String NAME_REGEX = "^COM10[0-9]{2}$";

	public Module(String name) {
		if (Pattern.matches(NAME_REGEX, name)) {
			this.name = name;
		} else {
			this.name = "Error";
		}
	}
	public String getName() {
		return name;
	}
}
