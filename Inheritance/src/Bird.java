public class Bird extends Animal {
    
    public Bird(String type, int age, int heightInInches, int weight) {
        super(type, age, heightInInches, weight);
    }

    public void fly() {
        System.out.println("Flying...");    
    }

}