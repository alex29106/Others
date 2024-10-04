package ProblemSet_5a;
import java.time.Month;

public class RainfallYear {
	private int year;
	private double highestRainfall;
	private double[] rainfallMonths;
	private static int maxRainfallMonths = 12;
	private double totalRainfall;

	public RainfallYear(int year) {
		super();
		this.year = year;
		this.rainfallMonths = new double[maxRainfallMonths];
	}
	public int getYear() {
		return year;
	}
	public double calculateMeanRainfall() {
		for (int i = 0; i < maxRainfallMonths; i++) {
			totalRainfall += rainfallMonths[i];
		}
		if (totalRainfall == 0) {
			return totalRainfall;
		}
		return totalRainfall / maxRainfallMonths;
	}
	public double calculateHighestRainfall() {
		for (int i = 0; i < maxRainfallMonths; i++) {
			if (rainfallMonths[i] > highestRainfall) {
				highestRainfall = rainfallMonths[i];
			}
		}
		return highestRainfall;
	}
	public void enterData(double[] inRainfall) {
		this.rainfallMonths = inRainfall;
	}
	public double getRainfallMonth(String inMonth) {
		return rainfallMonths[Month.valueOf(inMonth).getValue() - 1];
	}
}
