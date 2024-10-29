package ProblemSet_3c;

public class Employee {
    private int id;
    private String forename;
    private String surname;
    private AnnualSalary salary;
    private Position companyPosition;

    public Employee(int id, String forename, String surname,
    		AnnualSalary salary, Position companyPosition) {
    	super();
        this.id = id;
        this.forename = forename;
        this.surname = surname;
        this.salary = salary;
        this.companyPosition = companyPosition;
    }
    public int getId() {
        return id;
    }
    public String getForename() {
        return forename;
    }
    public String getSurname() {
        return surname;
    }
    public double getSalary() {
        return salary.getSalary();
    }
    public String getPositionName() {
        return companyPosition.getRoleName();
    }
    public double getTax() {
        return salary.calculateTax();
    }
    public String eligibleForBonus() {
        if (salary.getSalary() > 40000) {
            return "is eligible for bonus.";
        } else {
            return "is not eligible for bonus.";
        }
    }
    public String toString() {
        return getSurname() + ", " + getForename() + " (" + id + "): "
        + companyPosition.getRoleName() + " at £" + salary.getSalary()
        + " (£" + salary.calculateTax() + " tax) and " + eligibleForBonus();
    }
}
