//Ayush Panwar (2400320100344)
import java.util.Scanner;
public class Pro_1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter Number of columns : ");
        int c = sc.nextInt();

        int[][] A = new int[r][c];
        int[][] B = new int[r][c];
        int[][] Sum = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter A[" + i + "][" + j + "] : ");
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter B[" + i + "][" + j + "] : ");
                B[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Sum[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Sum of two matrices is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(Sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
