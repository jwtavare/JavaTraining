package JavaBasicsMain;

import JavaBasicsSub1.ExampleClass;

public class LearningMethods {
    
    public static void main(String[] args) {
        // System.out.println("Print initial stuff");
        // System.out.println(MyUtils.printSomeStuff("Hello there!"));
        // MyUtils.sum2Numbers(1012, 1123);
        MyUtils myVar;
        myVar = new MyUtils();
        System.out.println(myVar);
        
        System.out.println(ExampleClass.doSomething(45));
    }
}

