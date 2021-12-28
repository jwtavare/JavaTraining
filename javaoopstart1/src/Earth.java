public class Earth {
    
    public static void main(String [] args) {
         
        Human tom = new Human("Tom", 35, 73, "Brown");
        //tom is a variable of type Human
        //new keyword used to call constructor method to create new object
        tom.speak();
        //invoking speak method on the Human object tom

        Human joe = new Human("Joe", 35, 25, "Blue");
    
        joe.speak();
        //used Human class's constructor to creat two Human objects
        //in reality tom and joe variables not just objects
        //object is created when the application runs
    }
}
