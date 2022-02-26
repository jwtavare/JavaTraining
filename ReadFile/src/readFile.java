import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

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
            } 
            
            catch (IOException e) {
                //TODO: handle exception
                e.printStackTrace();
            }

            String fileName = "/Users/tavares/Documents/File.rtf";
            try 
                (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
                
                    raf.seek(12);
                    System.out.println(raf.readLine());
                }
            catch (IOException e) {
                //TODO: handle exception
                System.out.println(e);
            }    
            for (int i = 1; i<=2 ; i++){
            String line = Files.readAllLines(Paths.get("/Users/tavares/Documents/File.rtf")).get(i);
            System.out.println(line);
            }
        }
}    

