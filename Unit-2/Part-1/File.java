import java.io.*;

public class File {
    public static void main(String[] args) {
        
        try{
            FileReader file = new FileReader("abc.txt");
        }
        catch (Exception e) {
            System.out.println("file not found");
        }

    }
}