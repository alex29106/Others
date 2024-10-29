package ProblemSet_9b;

public enum VATRate {
	ZERO(0), LOW(0.05), STANDARD(0.2);
	private double vat = 0;
	private VATRate(double vat) {
		this.vat = vat;
	}
	public double getValue() {
		return this.vat;
	}
}
