package ProblemSet_2b;

public class Food {
	private String name = null;
	private double amountOfSugar = 0;
	public Food(String name, double amountOfSugar) {
		super();
		this.name = name;
		this.amountOfSugar = amountOfSugar;
	}
	public double getAmountOfSugar() {
		return amountOfSugar;
	}
	public String getName() {
		return name;
	}
}
