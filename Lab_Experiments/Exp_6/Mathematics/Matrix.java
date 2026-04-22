//Ayush Panwar (2400320100344)
package Mathematics;
public class Matrix {
    public int[][] addMatrix(int A[][], int B[][]) {
        int rows = A.length;
        int cols = A[0].length;
        int C[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }
    public int[][] subMatrix(int A[][], int B[][]) {
        int rows = A.length;
        int cols = A[0].length;
        int C[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        return C;
    }
    public void printMatrix(int M[][]) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }
}