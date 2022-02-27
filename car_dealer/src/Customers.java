public class Customers {
    
    static String name;
    static int age;
    static String address;
    static double cashOnHand;

    public Customers(String name, int age, String address, double cashOnHand) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.cashOnHand = cashOnHand;
    }

    public void purchaseCar(Vehicles vehicle, Employees employee, boolean finance) {
        System.out.println("Hello, " + employee.empName + " I would like to buy a " + vehicle.carType);
        if (finance == true){
            System.out.println("I would like to finance the car please");
            double loanAmount = vehicle.carPrice - Customers.cashOnHand;
            System.out.println("I will be looking to finance " + loanAmount);
        } else {
            System.out.println("I do not need financing");
        }

    }
}
