public class LoopsPractice {

    public static void main(String[] args) {
        
        String str = "We have a large inventory of things in our warehouse" 
        + " the category:apperal and the slightly"
        + "more in demand category:makeup and the category:furniture and...";
        int count = 0;

        printCategories(str);

        while(count<=100){
            System.out.println("JT:" + count);
            count = count+1;

            if (count == 30){
                break;
            }
        }
    }
    //** extract all categories from the string arg
    public static void printCategories(String string) {
        int i = 0;
        while(true){
            int found = string.indexOf("category:", i);
            //variable returning first index locator whenever "category" is detected
            
            if (i == -1) break;
            int start = found + 9; 
            //accommodates starting position 9 chars from start 
            //of categories word plus colon
            
            int end = string.indexOf(" ", start); 
            System.out.println(string.substring(start, end));
            i=end+1;
            }
             
        }
    }


