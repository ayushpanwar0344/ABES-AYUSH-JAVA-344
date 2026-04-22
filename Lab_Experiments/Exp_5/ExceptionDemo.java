//Ayush Panwar (2400320100344)
import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter value of a: ");
            int a = sc.nextInt();
            System.out.print("Enter value of b: ");
            int b = sc.nextInt();
            int result = a / b;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integer values.");
        }
        finally {
            System.out.println("Program execution completed.");
        }
    }
}
