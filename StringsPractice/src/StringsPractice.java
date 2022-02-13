public class StringsPractice {
    public static void main(String[] args) {
        
        String str = "ABCDEF";
        String extractedString = str.substring (0,3);

        System.out.println(extractedString);

        String a = "Hello";
        String b = "there";

        if(a.equals("Hello")){
            System.out.println(a);
        } else {
            System.out.println("Not it!");
        }
    }
}
