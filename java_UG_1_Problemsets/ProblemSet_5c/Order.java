package ProblemSet_5c;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private Customer customer;
	private List<Pizza> pizzas = new ArrayList<>();

	public Order(Customer customer) {
		super();
		this.customer = customer;
	}

	public void addPizza(Pizza pizza) {
		pizzas.add(pizza);
	}
	public double calculateTotal() {
		double totalCost = 0;
		for (Pizza pizza : pizzas) {
			totalCost += pizza.calculateCost();
		}
		return totalCost;
	}
	public String printReceipt() {
		return "Customer: " + customer.toString() + "\n"
				+ "Number of Pizzas: " + pizzas.size()
				+ "\n" + "Total Cost: " + calculateTotal();
	}
}
