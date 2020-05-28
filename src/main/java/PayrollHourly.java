public class PayrollHourly extends PayrollEmployee {

    private double hourlyRate = 20.00;
    private int hoursWorked;

    PayrollHourly(String firstName, String lastName, int idNumber){
        super(firstName, lastName, idNumber);
    }

    @Override
    public void setPaycheckTotal() {
        paycheckTotal = hoursWorked * hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorkd() {
        return hoursWorked;
    }

    public void setHoursWorkd(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
