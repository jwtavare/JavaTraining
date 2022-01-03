public class Zoo {
    
    public static void main(String [] args) {
        Sparrow sparrow1 = new Sparrow("Blue", 15, 5, 1);
        sparrow1.move();
        Chicken chicken1 = new Chicken("White", 10, 5, 15);
        chicken1.eat();
        Animal sparrow2 = new Sparrow("Green", 5, 10, 20);
        sparrow2.swim();
        Animal fish1 = new Fish("Perch", 2, 5, 3);
        fish1.move();
    }
}
