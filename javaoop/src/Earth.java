public class Earth {
    
    public static void main(String [] args) {
         
        Human tom = new Human();
        //tom is a variable of type Human
        //new keyword used to call constructor method to create new object

        tom.age = 5;
        tom.heightInInches = 70;
        tom.eyeColor = "Brown";
        tom.name = "Tom Brown";

        tom.speak();
        //invoking speak method on the Human object tom

        Human joe = new Human();
        joe.age = 50;
        joe.heightInInches = 70;
        joe.eyeColor = "Blue";
        joe.name = "Joseph Brown";

        joe.speak();

        //used Human class's constructor to creat two Human objects
        //in reality tom and joe variables not just objects
        //object is created when the application runs
    }
}
