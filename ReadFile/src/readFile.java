import java.io.*;
import java.util.*;

public class readFile {
    public static void main(String[] args) throws Exception {
            try {
                File myObj = new File("/Users/tavares/Documents/File.rtf");
                Scanner myReader = new Scanner(myObj);
                
                while (myReader.hasNextLine()){
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                //TODO: handle exception
                System.out.println("An Exception has occurred ");
                e.printStackTrace();
            }
    } 
}
