public class PayrollDeveloper extends PayrollEmployee implements Bonus, Insured {

    double payPeriodEarnings = 9000.00;

    PayrollDeveloper(String firstName, String lastName, int idNumber){
        super(firstName, lastName, idNumber);
    }


    public void setPaycheckTotal() {
        paycheckTotal = payPeriodEarnings;
    }

    @Override
    public void receiveBonus(double amount) {
        paycheckTotal += amount;
    }


    @Override
    public void payInsuranceFee() {
        paycheckTotal -= 80.00;
    }


}
