package ProblemSet_3c;

public class AnnualSalary {
    private double salary;
    private double temp;
    private static double personalAllowence = 12570;
    private double taxes;
    private static double baseRate = 50270 - personalAllowence;
    private static double higherRate = 125140 - baseRate - personalAllowence;

    public AnnualSalary() {
    	super();
    	this.salary = 0;
    	this.temp = 0;
    	this.taxes = 0;
    }

    public double calculateTax() {
    	temp = salary;
        if (temp > personalAllowence) {
            temp -= personalAllowence;
            // if salary is more then BaseRate
            if (temp > baseRate) {
                taxes += baseRate * 0.2;
                temp -= baseRate;
                // if salary is more then higherRate
                if (temp > higherRate) {
                    taxes += higherRate * 0.4;
                    temp -= higherRate;
                    taxes += temp * 0.45;
                    return taxes;
                    }
                //if salary is more then BaseRate but lower then higherRate
                taxes += temp * 0.4;
                return taxes;
                }
            //if salary is more then PERSONAL_ALLOWANCE but lower then BaseRate
            taxes += temp * 0.2;
            return taxes;
            }
        return taxes;
    } //terrible
    public void setSalary(double salary) {
         this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
