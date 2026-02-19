import java.io.*;

public class Throws_checked {          //Works as method signature , checked , method is created
    
    static void  readFile() throws IOException{
        FileReader fr = new FileReader("txt.txt");
        System.out.println("file open ");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Exception handled: "+e.getMessage());
        }
    }
}
