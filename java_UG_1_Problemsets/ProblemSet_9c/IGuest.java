package ProblemSet_9c;

public interface IGuest {
	public double calculateTotalChargeIncVat();
	public double calculateVATChargeAtRate(VATRate r);
	public double calculateTotalChargeWithoutVAT();
	public void addCharge(Service service, double charge);
	public String toString();
}
