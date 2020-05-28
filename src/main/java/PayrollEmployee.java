public class PayrollEmployee {

    private String firstName;
    private String lastName;
    private int employeeId;
    protected double paycheckTotal;

    public PayrollEmployee(String firstName, String lastName, int employeeId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getPaycheckTotal() {
        return paycheckTotal;
    }

    public void setPaycheckTotal() {
    }
}
