import java.io.*;
import java.util.*;

public class JavaIO {
    public static void main(String[] args) throws Exception {

        String directoryName = "/users/tavares/Documents/Countries.rtf";
        String fileName = "/users/tavares/Documents/";
        File file = new File(fileName);
        File directory = new File(directoryName);
        System.out.println("File/Directory name: " + file.getName());
        System.out.println("Parent name: " + file.getParent());
        System.out.println("Can read?: " + file.canRead());
        System.out.println("Can write?: " + file.canWrite());
        System.out.println("File exists?: " + file.exists());

        if (file.exists()){
            System.out.println("deleted?: " + file.delete());
        }
        if (!file.exists()){
            System.out.println("created?: " + file.createNewFile());
        }
        
        System.out.println("Is File?: " + file.isFile());
        System.out.println("Is Directory?: " + file.isDirectory());
        System.out.println(("Last modified?: " + new Date (file.lastModified())));
        
        File directoryList[] = directory.listFiles();
        for (int i = 0; i < directoryList.length; i++){
            File directoryObj = directoryList[i];
            if (directoryObj.isFile()){
                System.out.println("Files: " + directoryObj.getCanonicalPath());
            }
            if (directoryObj.isDirectory()) {
                System.out.println("Directories: " + directoryObj.getCanonicalPath());
            }
        }
        try {
            RandomAccessFile raf = new RandomAccessFile(directoryName , "rw");
            
            char c = 'A';
            String str = "String with a binary in it";
            int i = 5;
            double d =3.5;
            raf.writeChar(c);
            raf.writeUTF(str);
            raf.writeInt(i);

        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }    
}
