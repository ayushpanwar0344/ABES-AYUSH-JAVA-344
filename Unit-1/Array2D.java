public class Array2D {
    
    public static void main(String[] args) {
        int[][] matrix = {             //In 2D array number of columns cannot be different in each row
            {1,2,3},
            {4,5,6},
        };

        System.out.println("2D Array : ");

        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
