public class PayrollExecutive extends PayrollEmployee implements Bonus, Insured {

    private double payPeriodEarnings = 20000.00;

    PayrollExecutive(String firstName, String lastName, int idNumber){
        super(firstName, lastName, idNumber);
    }

    @Override
    public void receiveBonus(double amount) {
        paycheckTotal += amount * 3;
    }

    @Override
    public void payInsuranceFee() {
        paycheckTotal -= 10.00;
    }

    public double getPayPeriodEarnings() {
        return payPeriodEarnings;
    }

    @Override
    public void setPaycheckTotal() {
        paycheckTotal = payPeriodEarnings;
    }
}
