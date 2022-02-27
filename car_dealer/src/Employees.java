import java.util.Scanner;

public class Employees {
    
    String empName;
    int empAge;
    double empSalary;

    public Employees(String empName, int empAge, double empSalary) {
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    public boolean runCreditHistory(){
        if (Customers.cashOnHand < 4000){
            System.out.println("Your application has been denied, " + Customers.name);
            return false;
        } else  {
            System.out.println("Congrats your application is approved, " + Customers.name);
            return true;
        }

    }

}
