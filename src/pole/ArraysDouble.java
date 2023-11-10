package pole;

import java.util.Arrays;

public class ArraysDouble {
    public static void main(String[] args) {
        double[] doubleArray = {15.4, 123.5, 4.2, -0.98, -1086.65};

        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]);
        }
        System.out.println("-------");
        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] < 0){
                System.out.println(doubleArray[i]);
            }
        }
        System.out.println("-------");
        double vysledek = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            vysledek = vysledek + doubleArray[i];
        }
        System.out.println("Soucet pole: " + vysledek);
        System.out.println("Prumer pole: " + vysledek / doubleArray.length);
        System.out.println("-------");

//        double[] points = {-2,-1,0,1,-2};
//        for (int i = 0; i < points.length; i++) {
//            System.out.println("body:");
//            System.out.println("x = " + points[i]);
//            double y = 2*points[i] + 5;
//            System.out.println("y = " + y);
//        }
//        System.out.println("-------");

        System.out.println(Arrays.toString(doubleArray));//vypis pole


    }
}
