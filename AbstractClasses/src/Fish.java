public class Fish extends Animal {

    public Fish(String type, int age, int heightInInches, int weight) {
        super(type, age, heightInInches, weight);
    }

    public void move() {
        System.out.println("Fish is moving...");
    }
}