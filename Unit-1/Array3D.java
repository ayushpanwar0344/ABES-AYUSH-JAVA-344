public class Array3D {
    
    public static void main(String[] args) {
        int[][][] array3D = {
            {
                {1,2,9},
                {3,4},
            },
            {
                {5,6},
                {7,8},
            }
        };

        System.out.println("3D Array is : ");

        for(int i=0;i<array3D.length;i++) {
            for(int j=0;j<array3D[i].length;j++) {
                for(int k=0;k<array3D[i][j].length;k++) {
                    System.out.println(array3D[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
