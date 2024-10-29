package ProblemSet_9b;

import java.util.List;
import java.util.ArrayList;

public class Guest implements IGuest {
	private String forename;
	private String surname;
	private String address;
	private String telephone;
	private List<Charge> charges;

	public Guest(String forename, String surname,
			String address, String telephone) {
		super();
		this.forename = forename;
		this.surname = surname;
		this.address = address;
		this.telephone = telephone;
		this.charges = new ArrayList<Charge>();
	}

	public String getForename() {
		return forename;
	}
	public String getSurname() {
		return surname;
	}
	public String getAddress() {
		return address;
	}
	public String getTelephone() {
		return telephone;
	}
	public List<Charge> getCharges() {
		return charges;
	}

	public void addCharge(Service service, double charge) {
		charges.add(new Charge(service, charge));
	}

	public double calculateTotalChargeWithoutVAT() {
		double cost = 0;
		for (Charge charge:charges) {
			cost += charge.getCharge();
		}
		return cost;
	}

	public double calculateVATChargeAtRate(VATRate r) {
		double vat = 0;
		for (Charge charge:charges) {
			if (charge.getService().getRate() == r) {
				vat += charge.calculateVAT();
			}
		}
		return vat;
	}

	public double calculateTotalChargeIncVat() {
		double vat = 0;
		for (Charge charge:charges) {
			vat += charge.calculateVAT();
		}
		return calculateTotalChargeWithoutVAT() + vat;
	}

	public String toString() {
		return forename + " " + surname + ", "
				+ address + ", " + telephone;
	}
}
