


package procvicovani;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class pole_procv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int pocet = sc.nextInt();
//        int[] random = new int[pocet];
//        for (int i = 0; i < random.length; i++) {
//            random[i] = (int)(Math.random()*100 + 1);
//        }
//        System.out.println(Arrays.toString(random));

//        int[] array = {10,5,9,8,7,6,3,2};
//        int sude = 0;
//        int liche = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i]%2==0){
//                sude = sude + array[i];
//            }else {
//                liche = liche + array[i];
//            }
//        }
//        System.out.println("Soucet vsech sudych cisel je: " + sude);
//        System.out.println("Soucet vsech lichych cisel je: " + liche);

//        int[] prvniArray = {9,4,400,100,25,400};
//        double[] druhyArray = new double[prvniArray.length];
//
//        for (int i = 0; i < prvniArray.length; i++) {
//            druhyArray[i] = Math.sqrt(prvniArray[i]);
//        }
//        System.out.println("Cisla " + Arrays.toString(prvniArray));
//        System.out.println("Odmocniny " + Arrays.toString(druhyArray));

//        int[] array = {1,2,3,4,5,12,7,8,9,10};
//        int tip = sc.nextInt();
//        int counter = 0;
//        boolean[] indexy = new boolean[array.length];
//        for (int i = 0; i < array.length; i++) {
//            if (tip == array[i]) {
//                counter++;
//                indexy[i]=true;
//            }
//        }
//        System.out.println("Vyskytuje se " + counter + "x");
//        if (counter>0) {
//            System.out.println("Indexy:");
//            for (int j = 0; j < indexy.length; j++) {
//                if (indexy[j]==true){
//                    System.out.print(j+1 + ", ");
//                }
//            }
//        }

//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            int input = 0;
//            while (input<10 || input>100){
//                input = sc.nextInt();
//                if (input<10 || input>100){
//                    System.out.println("Spatne cislo");
//                }
//            }
//            array[i]=input;
//        }
//        System.out.println(Arrays.toString(array));

        int[] pickedNumbers ={3,9,6,18,23,15,7,25,23,30};
        int[] guesses = new int[5];
        boolean[] trfl = new boolean[guesses.length];
        int counter = 0;

        for (int i = 0; i < guesses.length; i++) {
            guesses[i] = sc.nextInt();
        }

        for (int j = 0; j < guesses.length; j++) {
            for (int k = 0; k < pickedNumbers.length; k++) {
                if (guesses[j]==pickedNumbers[k]){
                    trfl[j]=true;
                }
            }
        }

        for (int l = 0; l < trfl.length; l++) {
            if (trfl[l]==true){
                System.err.print(guesses[l] + ", ");
                counter++;
            }else {
                System.out.print(guesses[l] + ", ");
            }
        }
        System.out.println();
        System.out.println("Soutezici tipl spravne " + counter + " cisel");
    }
}
