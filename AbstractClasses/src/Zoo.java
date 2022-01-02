public class Zoo {
    
    public static void main(String [] args) {
         
        //Animal animal1 = new Animal("Fox",20,35,20);
        //Instance Variable of type Animal is created in memory
        //Somewhere else in memory the object is created
        //Variable for animal1 will point to the memory address for the Animal object
        //Animal animal2 = new Animal("Cow",100,100,25);
        //Animal animal3 = new Animal("Wolf",25,25,100);
        Bird bird1 = new Bird("Cockatoo", 13, 7, 2); 
        Fish fish1 = new Fish("Mahi", 2, 12, 10);
        Chicken chicken1 = new Chicken("Chicken", 4, 8, 4);
        //Main class initializing objects by referencing constructors in other classes

        //animal1.eat();
        //Variable calls associated object in memory and tells it to execute eat() Method
        //animal2.eat();
        //animal3.eat();
        bird1.walk();
        fish1.swim();
        //chicken1.fly();
    }
}
