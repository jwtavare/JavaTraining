import java.io.*;

public class JavaIO {
    public static void main(String[] args) throws Exception {

        String fileName = "/users/tavares/Documents/Countries.rtf";
        File file = new File(fileName);
        System.out.println("File/Directory name: " + file.getName());
        System.out.println("Parent name: " + file.getParent());
    }
}
