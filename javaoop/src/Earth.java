public class Earth {
    
    public static void main(String [] args) {
         
        Human tom;
        tom = new Human();
        //tom is a variable of type Human
        //new keyword used to call constructor method to create new object

        tom.age = 5;
        tom.heightInInches = 70;
        tom.eyeColor = "Brown";
        tom.name = "Tom Brown";

        tom.speak();
        //invoking speak method on the object tom

    }
}
