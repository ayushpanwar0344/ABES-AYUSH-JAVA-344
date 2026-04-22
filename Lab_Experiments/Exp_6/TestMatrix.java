//Ayush Panwar (2400320100344)
import java.util.Scanner;
import Mathematics.Matrix;
public class TestMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();
        int A[][] = new int[r][c];
        int B[][] = new int[r][c];
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        Matrix m = new Matrix();
        int add[][] = m.addMatrix(A, B);
        System.out.println("Addition of matrices:");
        m.printMatrix(add);
        int sub[][] = m.subMatrix(A, B);
        System.out.println("Subtraction of matrices:");
        m.printMatrix(sub);
    }
}