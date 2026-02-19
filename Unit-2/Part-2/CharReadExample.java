import java.io.FileReader;
import java.io.IOException;

public class CharReadExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("charfile.txt");
            int data;
            while((data = fr.read()) != -1) {
                System.out.print((char) data);             //We use char typecasting to convert the integer value read from the file 
            }                                              // back to a character before printing it. This is necessary because the 
            fr.close();                                    // read() method returns an integer representation of the character, and 
        } catch (IOException e) {                          // we want to display it as a character.
            System.out.println("Error: " + e.getMessage());  
        }
    }
}
