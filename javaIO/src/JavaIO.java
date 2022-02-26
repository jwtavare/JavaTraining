import java.io.*;
import java.util.*;
import javax.tools.FileObject;

public class JavaIO {
    public static void main(String[] args) throws Exception {

        String fileName = "/users/tavares/Documents/";
        File file = new File(fileName);
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
        
        File fileList[] = file.listFiles();
        for (int i = 0; i < fileList.length; i++){
            File fileObj = fileList[i];
            if (fileObj.isFile()){
                System.out.println("Files: " + fileObj.getCanonicalPath());
            }
            if (fileObj.isDirectory()) {
                System.out.println("Directories: " + fileObj.getCanonicalPath());
            }
        }
    }    
}
