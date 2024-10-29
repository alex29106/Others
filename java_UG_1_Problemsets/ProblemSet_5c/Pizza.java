package ProblemSet_5c;

public class Pizza {
	private static int maxToppings = 10;
	private String[] toppings;

	public Pizza() {
		super();
		this.toppings = new String[maxToppings];
	}

	public String[] getToppings() {
		return toppings;
	}

	public void addToppings(String[] toppings) {
		this.toppings = new String[maxToppings];
		for (int i = 0; i < toppings.length; i++) {
			this.toppings[i] = toppings[i]; // terrible
		}
	}

	public String printToppings() {
		String text = "";
		for (int i = 0; i < maxToppings; i++) {
			if (toppings[i] != null) {
				text += toppings[i] + ",";
			}
		}
		if (text.charAt(text.length() - 1) == ',') {
			text = text.substring(0, text.length() - 1);
		}
		return text;
	}

	public double calculateCost() {
		int count = 0;
		for (int i = 0; i < maxToppings; i++) {
			if (toppings[i] != null) {
				count += 1;
			}
		}
		switch (count) {
			case 0:
				return 0.00;
			case 1:
				return 9.99;
			case 2:
			case 3:
				return 10.99;
			case 4:
			case 5:
				return 11.99;
			case 6:
				return 12.99;
			case 7:
				return 13.99;
			case 8:
				return 14.99;
			case 9:
				return 15.99;
			case 10:
				return 14.99;
			default:
				return 0.00;
		}
	}
}
