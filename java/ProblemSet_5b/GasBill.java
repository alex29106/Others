package ProblemSet_5b;

public class GasBill {
	private String accountNumber = null;
	private double amount = 0;
	private Customer customer;

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
		return (inAccountNumber.charAt(0) == 'G')
				&& inAccountNumber.charAt(5) == '-'
				&& inAccountNumber.charAt(10) == '-';
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
