package ProblemSet_9c;

import java.util.regex.Pattern;

public class Service {
	private String code;
	private String name;
	private VATRate rate;
	private static final String CODE_REGEX = "[A-Z]{4}[0-9]{5}";

	public Service(String code, String name, VATRate rate) {
		if (code == null || name == null || rate == null) {
			throw new NullPointerException();
		}
		if (!Pattern.matches(CODE_REGEX, code)) {
			throw new IllegalArgumentException();
		}
		this.code = code;
		this.name = name;
		this.rate = rate;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public VATRate getRate() {
		return rate;
	}
}
