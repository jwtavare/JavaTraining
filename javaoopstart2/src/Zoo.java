public class Zoo {
    
    public static void main(String [] args) {
         
        Animal animal1 = new Animal("Fox",20,35,20);
        Animal animal2 = new Animal("Cow",100,100,25);
        Animal animal3 = new Animal("Wolf",25,25,100);
        Bird bird1 = new Bird(); 
        Fish fish1 = new Fish();

        animal1.eat();
        animal2.eat();
        animal3.eat();
        bird1.fly();
        fish1.swim();

    }
}
