package ProblemSet_2b;

public class Meal {
	private Food mainCourse;
	private Food dessert;
	public Meal(Food mainCourse, Food dessert) {
		super();
		this.mainCourse = mainCourse;
		this.dessert = dessert;
	}
	public double calculateTotalSugarLevel() {
		return mainCourse.getAmountOfSugar()
				+ dessert.getAmountOfSugar();
	}
	public String toString() {
		return "Meal [mainCourse = " + mainCourse.getName()
		+ ", dessert = " + dessert.getName() + "]";
	}
}
