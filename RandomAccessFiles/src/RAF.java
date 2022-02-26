import java.util.*;
import java.io.*;

public class RAF {
    public static void main(String[] args) throws Exception {
        String fileName = "/Users/tavares/Documents/Countries.rtf";

        try {
            RandomAccessFile raf = new RandomAccessFile(fileName, "rw");

            char c = 'A';
            String str = "String with a Binary in it";
            int i = 5;
            double d = 3;

            raf.writeChar(c);
            raf.writeUTF(str);
            raf.writeInt(i);
            raf.writeDouble(d);

            raf.seek(0);

            System.out.println(raf.readChar());
            System.out.println(raf.readUTF());
            System.out.println(raf.readInt());
            System.out.println(raf.readDouble());
            raf.close();

        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }

    public static void readFile(String[] args) {
        try {
            File myObj = new File("/Users/tavares/Documents/File.txt");
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
