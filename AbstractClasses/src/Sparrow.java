public class Sparrow extends Bird implements Flyable {

    public Sparrow(String type, int age, int heightInInches, int weight) {
        super(type, age, heightInInches, weight);
    }
    
    public void Fly() {
        System.out.println("Flying high...");
    }

}
