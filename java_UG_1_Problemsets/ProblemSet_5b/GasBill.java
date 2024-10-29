package ProblemSet_5b;

import java.util.regex.Pattern;

public class GasBill {
	private String accountNumber = null;
	private double amount = 0;
	private Customer customer;
	private final static String ACCOUNT_REGEX = "^G[1-9]{4}-[1-9]{4}-[1-9]{4}$";

	public GasBill(String accountNumber,
			double amount, Customer customer) {
		if (checkAccountAccuracy(accountNumber)) {
			this.accountNumber = accountNumber;
		} else {
			this.accountNumber = "Invalid Account";
		}
		this.amount = amount;
		this.customer = customer;
	}

	public boolean checkAccountAccuracy(String inAccountNumber) {
		return Pattern.matches(ACCOUNT_REGEX, inAccountNumber);
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getCustomer() {
		return customer.toString();
	}
	public String displayAccountDetails() {
		return "Gas Bill" + "\n" + " Account Number:" + accountNumber
				+ "\n" + " Customer:" + customer.toString()
				+ "\n" + " Amount due:£"
				+ String.format("%.2f", amount);
	}
}
