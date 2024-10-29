package ProblemSet_4c;

public class Module {
	private String code;
	private double average;

	public Module(String code, double average) {
		super();
		this.code = code;
		this.average = average;
	}

	public double getAverage() {
		return average;
	}
	public String getCode() {
		return code;
	}
	public String toString() {
		return code + ": " + average;
	}
}
