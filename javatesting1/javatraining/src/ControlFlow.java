import javax.swing.text.StyledEditorKit.BoldAction;

public class ControlFlow {
    
    public static void main(String[] args) {

        boolean hungry = true;
        
        if (hungry){
            System.out.println("I am starving ...");
        } else {
            System.out.println("I'm not hungry ...");
        }

        int hungerRating = 5;
        
        if (hungerRating > 6){
            System.out.println("Not hungry");
        } else {
            System.out.println("I am starving");
        }

        int favoriteTemp = 75;
        int currentTemp = 60;
        String opinion;
        
        if (currentTemp < favoriteTemp - 30){
            opinion = "It is very cold...";
        } else if (currentTemp < favoriteTemp - 20){
            opinion = "It is kinda cold out";
        }else if (currentTemp > favoriteTemp + 10){
            opinion = "It's hot!!!";
        }

        System.out.println(opinion);
    }
}
