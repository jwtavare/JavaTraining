import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        
        Customers cust1 = new Customers("Jason", 50, "134 Prospect Street", 3400);
        Customers cust2 = new Customers("John", 45, "134 John Street", 4500 );
        Employees emp1 = new Employees("Joe", 35, 40000);
        Employees emp2 = new Employees("Jane", 32, 40000);
        Vehicles audi = new Vehicles("Audi", "2015", "Blue", 25000);
        Vehicles ford = new Vehicles("Ford", "2014", "White", 20000);
        Vehicles toyota = new Vehicles("Nissan", "2000", "Black", 10000);

        
        cust1.purchaseCar(audi, emp1, true);
        cust2.purchaseCar(ford, emp2, true);
       


    }
}
