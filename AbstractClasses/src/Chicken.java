import javax.swing.event.SwingPropertyChangeSupport;

public class Chicken extends Bird{

    public Chicken(String type, int age, int heightInInches, int weight) {
        super(type, age, heightInInches, weight);
    }
      
    public void move() {
        System.out.println("Chicken is moving along...");
    }
}