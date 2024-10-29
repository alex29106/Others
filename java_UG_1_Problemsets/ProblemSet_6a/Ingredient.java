package ProblemSet_6a;

public class Ingredient {
	private String name;
	private IngredientType type;
	private Supplier supplier;
	private double rawWeight;

	public Ingredient(String name, IngredientType type,
			Supplier supplier, double rawWeight) {
		super();
		this.name = name;
		this.type = type;
		this.supplier = supplier;
		this.rawWeight = rawWeight;
	}
	public double getCookedWeight() {
		return rawWeight * 0.8;
	}
	public String getName() {
		return name;
	}
	public IngredientType getType() {
		return type;
	}
	public String getSupplier() {
		return supplier.toString();
	}
	public double getRawWeight() {
		return rawWeight;
	}
}
