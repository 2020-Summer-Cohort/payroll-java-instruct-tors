import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        CompanyRoster roster = new CompanyRoster();
        printEmployees(roster, false);
        double bonusAmount = getUserInput(roster);
        roster.calculatePay(bonusAmount);
        printEmployees(roster, true);
    }

    public static double getUserInput(CompanyRoster roster){
        Scanner scanner = new Scanner(System.in);
        for (PayrollEmployee employee: roster.getEmployeeRoster()){
            if(employee instanceof PayrollHourly){
                System.out.println("Please enter the number of hours " +
                        employee.getFirstName() + " " + employee.getLastName() +
                        " worked this pay period");
                ((PayrollHourly) employee).setHoursWorkd(scanner.nextInt());
            }
            if(employee instanceof PayrollSales){
                System.out.println("Please enter the commission amount for " +
                        employee.getFirstName() + " " + employee.getLastName() +
                        " this pay period");
                ((PayrollSales) employee).setCommission(scanner.nextDouble());
            }
        }
        System.out.println("What is the bonus amount for the pay period? Enter 0 if no bonus.");
        return scanner.nextDouble();
    }

    public static void printEmployees(CompanyRoster roster, boolean paychecksCalculated){
        for (PayrollEmployee employee: roster.getEmployeeRoster()){
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " ID: " + employee.getEmployeeId());
            if (paychecksCalculated) {
                System.out.println("Paycheck total: " + employee.getPaycheckTotal());
            }
        }
    }
}
