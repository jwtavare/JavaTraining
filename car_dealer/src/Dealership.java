import java.util.Scanner;

import javax.swing.text.Position;

public class Dealership {
    public static void main(String[] args) {
        
        
        Scanner name = new Scanner(System.in);
        Scanner age = new Scanner(System.in);
        Scanner position = new Scanner (System.in);
        
        Employees employeeInfo = new Employees(name, age, position );

    }
}
