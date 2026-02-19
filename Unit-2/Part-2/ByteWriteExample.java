import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWriteExample {            //FileWrite and FileRead are base classes for CharWrite and CharRead respectively.
    public static void main(String[] args) {     //  Similarly, ByteWrite and ByteRead are base classes for all byte stream classes.
        try {
            FileOutputStream fos = new FileOutputStream("bytefile.txt");
            String data = "Hello Java Byte Stream!";
            byte[] byteData = data.getBytes();
            fos.write(byteData);
            fos.close();
            System.out.println("Data written successfully.");
         } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
