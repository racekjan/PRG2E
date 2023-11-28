package procvicovani;

import java.util.Arrays;

public class pole_procv3 {
    public static void main(String[] args) {
//        int[] pole = new int[10];
//        for (int i = 0; i < pole.length; i++) {
//            pole[i] = 3*i;
//        }
//
//        for (int j = 1; j < pole.length; j++) {
//            if (j % 2 == 0){
//                pole[j]=pole[j]*-1;
//            }
//        }
//        System.out.println(Arrays.toString(pole));

        int rows = 10;
        int colums = 10;
        char[][] pole2 = new char[rows][colums];
        for (int k = 0; k < rows; k++) {
            for (int l = 0; l < colums; l++) {
                pole2[k][k] = 'x';
                pole2[k][colums-k-1] = 'x';
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                System.out.print(pole2[i][j]);
            }
            System.out.println();
        }


    }
}
