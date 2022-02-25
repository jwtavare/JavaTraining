import java.util.Scanner;

public class Vehicles {

    public static Vehicles newVehicle (final Scanner scanner){
        String carType = scanner.nextLine();
        String carYear = scanner.nextLine();
        String carColor = scanner.nextLine();
        return new Vehicles();
   } 
}
