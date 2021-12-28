package JavaBasicsMain;

public class MyUtils{
    
    public static String printSomeStuff(String arg){
        return arg;
    }
    public static void printSomeStuff(Integer arg){
        System.out.println(arg);
    }
    public static void sum2Numbers(Integer firstArg, Integer secArg) {
        System.out.println(firstArg + secArg);
    }
    public int add10(int someArg) {
        int result = someArg + 10;
        return result;
    }
}
