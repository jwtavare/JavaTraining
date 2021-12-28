public class NewEarth {
    
    public static void main(String [] args) {
         
        Human human1 = new Human("Tom", 72, 12, "Brown");
        Human human2 = new Human("Joe", 56, 15, "Blue");
        Human human3 = new Human("Brian", 70, 10, "Hazel");

        human1.speak();
        human2.speak();
        human3.speak();
    }
}
