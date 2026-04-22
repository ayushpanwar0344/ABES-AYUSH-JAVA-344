//Ayush Panwar (2400320100344)
import java.io.*;
import java.util.Scanner;
public class FileIOExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter some text: ");
            String data = sc.nextLine();
            FileWriter fw = new FileWriter("sample.txt");
            fw.write(data);
            fw.close();
            FileReader fr = new FileReader("sample.txt");
            int ch;
            System.out.println("File contents are:");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}