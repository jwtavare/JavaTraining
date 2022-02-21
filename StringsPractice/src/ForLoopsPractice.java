public class ForLoopsPractice {

    public static void main(String[] args) {
        //use for loops for specific cases to increment a variable
        //also use when you know exact times you want to look through block of code
        
        String name = "JasonTavares 143 Prospect Street";

        for (int i=name.length()-1; i>=0; i--){
            System.out.println("char: " + name.charAt(i));
        }

        for (int i=0; i<=100; i=i+2){
            System.out.println("int: " + i);
        }

        for (int idx=0; idx<100; idx++) {
            System.out.println(idx);
        }       
    }
}
 