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
        System.out.println("eating....");
    }

    public void walk(){
        System.out.println("walking...");
    }

    public void swim() {
        System.out.println("Swimming...");    
    }

    public void fly() {
        System.out.println("Flying...");    
    }
}
