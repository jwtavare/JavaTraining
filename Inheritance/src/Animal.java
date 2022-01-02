public class Animal {

    String type;
    int age;
    int heightInInches;
    int weight;
    
    public Animal(String type, int age, int heightInInches, int weight) {
        this.type = type;
        this.age = age;
        this.heightInInches = heightInInches;
        this.weight = weight;
    }
    
    public void eat(){
        System.out.println("Eating....");
    }

    public void walk(){
        System.out.println("Walking...");
    }

    public void swim() {
        System.out.println("Swimming...");    
    }
}
