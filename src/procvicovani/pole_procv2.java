package procvicovani;

import java.util.Arrays;
import java.util.Scanner;

public class pole_procv2 {
    public static void main(String[] args) {
        int[] guessArray = new int[5];
        for (int i = 0; i < guessArray.length; i++) {
            guessArray[i] = (int)(Math.random()*15+1);
        }
        System.out.println(Arrays.toString(guessArray));
        int score = 0;
        Scanner sc = new Scanner(System.in);
        int input = 0;
        for (int i = 0; i < 6; i++) {
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
