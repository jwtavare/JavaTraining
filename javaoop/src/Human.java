import java.security.PublicKey;

public class Human {

    String name;
    int age;
    int heightInInches;
    String eyeColor;

    public Human(){
 
    }

    public void speak(){
        System.out.println("Hello my name is " + name);
        System.out.println("My height in inches is " + heightInInches);
        System.out.println("My age is " + age);
        System.out.println("My eyes are " + eyeColor);
    }

    public void eat(){
        System.out.println("eating....");
    }

    public void walk(){
        System.out.println("walking...");
    }

    public void work(){
        System.out.println("working...");
    }
}