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
    }
}
