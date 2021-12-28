package JavaBasicsMain;
import javax.sql.rowset.CachedRowSet;
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

        int favoriteTemp = 100;
        int currentTemp = 100;
        String opinion;
        
        if (currentTemp == favoriteTemp){
            if (currentTemp < favoriteTemp - 30){
                opinion = "It is very cold...";
            } else if (currentTemp < favoriteTemp - 20){
            opinion = "It is kinda cold out";
            }else if (currentTemp > favoriteTemp + 10){
            opinion = "It's hot!!!";
            } else {
            opinion = "It is a beauty!";
            }
        }else {
            opinion = "Invalid temp";
        }
        System.out.println(opinion);

        int month = 4;
        String monthString;

        switch(month){

        case 1:monthString = "Jan";
            break;
        case 2:monthString = "Feb";
            break;
        case 3:monthString = "Mar";
            break;
        case 4:monthString = "Apr";
            break;
        default:monthString = "Unknown Month";
            break;
        }
        System.out.println(monthString);
    }
}
