package ProblemSet_7b;

import java.util.regex.Pattern;
import java.util.ArrayList;

public class Student {
	private String name;
	private String urn;
	private ArrayList<Module> moduleList;
	private static final String NAME_REGEX = "[A-Z][a-z]*[ [A-Z][a-z]*]*";
	private static final String URN_REGEX = "[0-9]{5}";


	public Student(String name, String urn) {
		if (Pattern.matches(URN_REGEX, urn)) {
			this.urn = urn;
		} else {
			this.urn = "00000";
		}
		if (Pattern.matches(NAME_REGEX, name)) {
			this.name = name;
		}
		moduleList = new ArrayList<Module>();
	}


	public int getUrn() {
		return Integer.valueOf(urn);
	}
	public String getName() {
		return name;
	}


	public void addModuleList(Module module) {
		if (module != null) {
			moduleList.add(module);
		}
	}


	public String printModules() {
		String text = "";
		for (Module module:moduleList) {
			if (text == "") {
				text = module.getName();
			} else {
				text += ", " + module.getName();
			}
		}
		return text;
	}
}
