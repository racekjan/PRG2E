package procvicovani;

import java.util.Arrays;
import java.util.Scanner;

public class pole_procv2 {
    public static void main(String[] args) {
        int tries = 6;
        int numebers = 5;
        int min = 5;
        int max = 20;
        int[] guessArray = new int[tries];

        for (int i = 0; i < guessArray.length; i++) {
            guessArray[i] = (int)(Math.random()*(max+min+1)-min);
        }
        System.out.println(Arrays.toString(guessArray));
        int score = 0;
        Scanner sc = new Scanner(System.in);
        int input = 0;
        for (int i = 0; i < tries; i++) {
            System.out.println("Tipni cislo");
            input = sc.nextInt();
            for (int j = 0; j < guessArray.length; j++) {
                if (guessArray[j] == input){
                    score += 20;
                    System.out.println("Cislo nalezeno, + 20 bodu");
                    guessArray[j] = -1;

                }
            }
            if (score == 100){
                System.out.println("Tipl jsi vse");
                break;
            }
        }
        System.out.println("Hra ukoncena");
        System.out.println("Ziskal jsi " + score + " bodu");
    }
}
