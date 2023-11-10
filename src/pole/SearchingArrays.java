package pole;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingArrays {
    public static void main(String[] args) {
        int[] arr = {456, 30, 22, 12, 158, 870, 871, 654, 1};
        int[] arr1 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }

        //nejvetsi cislo
        int max = Integer.MIN_VALUE; //konstanta
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max: " + max);

        //nejmensi cislo
        int min = Integer.MAX_VALUE; //konstanta
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min: " + min);

        //seradi pole vzestupne
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //napl pole od uzivatele
        int[] emptyArray = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < emptyArray.length; i++) {
            System.out.println("Zadej cislo");
            emptyArray[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(emptyArray));

        //naplneni pole od uzivatele od 1 do 10
        int[] emptyArray1 = new int[5];
        int input = 0;
        for (int i = 0; i < emptyArray1.length; i++) {
            System.out.println("Zadej cislo");
            input = sc.nextInt();
            while (!(input > 1 && input < 10)) {
                System.out.println("zadal jsi spatne cislo");
            }
            emptyArray1[i] = input;
        }
    }
}

