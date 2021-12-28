package JavaBasicsMain;
import java.lang.Thread;

public class VariablesContinued {
    
    private static final boolean True = false;

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("The current thread is "+t);
        
        int var = 1000000000;
        long bigNumber = 100000000000000000L;
        short smallNumber = 3333; 
        byte reallySmall = 127;
        double decimalVariable = 300.123456;
        boolean decision = false;
        char letter = '9';

        System.out.println(var + bigNumber + smallNumber + reallySmall);
        System.out.println(decimalVariable);

        if (decimalVariable < 200) {
            System.out.println(decision);
        } else {
            decision = True;
            System.out.println(decision);
        }


    }
}

