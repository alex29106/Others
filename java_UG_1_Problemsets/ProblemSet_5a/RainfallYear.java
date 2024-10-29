package ProblemSet_5a;

public class RainfallYear {
	private int year;
	private double highestRainfall;
	private double[] rainfallMonths;
	private final static int MAX_RAINFALL_MONTHS = 12;
	private double totalRainfall;
	private enum Month {
		JANUARY(1), FEBRUARY(2), MARCH(3),
		APRIL(4), MAY(5), JUNE(6), JULY(7),
		AUGUST(8), SEPTEMBER(9), OCTOBER(10),
		NOVEMBER(11), DECEMBER(12);
		private int value = 0;
		private Month(int value) {
		this.value = value;
		}
		public int getValue() {
			return this.value;
		}
	}
	public RainfallYear(int year) {
		super();
		this.year = year;
		this.rainfallMonths = new double[MAX_RAINFALL_MONTHS];
	}
	public int getYear() {
		return year;
	}
	public double calculateMeanRainfall() {
		for (int i = 0; i < MAX_RAINFALL_MONTHS; i++) {
			totalRainfall += rainfallMonths[i];
		}
		if (totalRainfall == 0) {
			return totalRainfall;
		}
		return totalRainfall / MAX_RAINFALL_MONTHS;
	}
	public double calculateHighestRainfall() {
		for (int i = 0; i < MAX_RAINFALL_MONTHS; i++) {
			if (rainfallMonths[i] > highestRainfall) {
				highestRainfall = rainfallMonths[i];
			}
		}
		return highestRainfall;
	}
	public void enterData(double[] rainfall) {
		this.rainfallMonths = rainfall;
	}
	public double getRainfallMonth(String inMonth) {
		return rainfallMonths[Month.valueOf(inMonth).getValue() - 1];
	}
}
