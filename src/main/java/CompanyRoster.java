import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;

public class CompanyRoster {

    private ArrayList<PayrollEmployee> employeeRoster = new ArrayList<>(Arrays.asList(
            new PayrollSales("James", "Bond", 111),
            new PayrollSales("Yahn", "Fire", 121),
            new PayrollDeveloper("Mike", "More", 131),
            new PayrollDeveloper("Jessica", "Impor", 311),
            new PayrollDeveloper("Juan", "Than", 825),
            new PayrollExecutive("Mr", "Big", 111),
            new PayrollHourly("Opal", "Worket", 944),
            new PayrollHourly("Oliver", "Twist", 466)
    ));

    public ArrayList<PayrollEmployee> getEmployeeRoster() {
        return employeeRoster;
    }
    // We want to use an interface to apply insurance and bonuses because that way we
    // Can apply them when we want to. Only apply insurance fees once every other pay period
    public void calculatePay(double bonusAmount){

        for (PayrollEmployee employee: employeeRoster){
            employee.setPaycheckTotal();
            if (employee instanceof Bonus){
                ((Bonus) employee).receiveBonus(bonusAmount); //USING A METHOD WITHIN AN OBJECT TO ACCESS DATA
                // WITHIN THAT OBJECT IS REDUNDANT. OVERRIDE THE SETPAYCHECKTOTAL
            } if (employee instanceof Insured){
                ((Insured) employee).payInsuranceFee();
            }
        }
    }


}
