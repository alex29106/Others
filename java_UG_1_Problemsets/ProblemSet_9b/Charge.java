package ProblemSet_9b;

public class Charge {
	private Service service;
	private double charge;

	public Charge(Service service, double charge) {
		if (charge <= 0) {
			throw new IllegalArgumentException();
		}
		this.service = service;
		this.charge = charge;
	}

	public Service getService() {
		return service;
	}

	public double getCharge() {
		return charge;
	}
	public double calculateVAT() {
		return charge * service.getRate().getValue();
	}
}
