import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("What type of car are you looking for? ");
        String carType = scan.nextLine();
        System.out.println("What year of car? ");
        String carYear = scan.nextLine();
        System.out.println("What color car would you like? ");
        String carColor = scan.nextLine();

        Vehicles CarInfo = new Vehicles(carType, carYear, carColor);
        


    }
}
