public class PayrollSales extends PayrollEmployee implements Bonus {

    private double commission;
    private double payPeriodEarnings = 3000.00;

    PayrollSales(String firstName, String lastName, int idNumber){
        super(firstName, lastName, idNumber);
    }
    @Override
    public void setPaycheckTotal() {
        paycheckTotal = payPeriodEarnings + commission;
    }

    @Override
    public double getPaycheckTotal() {
        return paycheckTotal;
    }

    @Override
    public void receiveBonus(double amount) {
        paycheckTotal += amount;
    }

    public double getCommission() {
        return commission;
    }

    public double getPayPeriodEarnings() {
        return payPeriodEarnings;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}

