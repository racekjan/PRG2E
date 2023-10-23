package loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class dvacettririjen {
    public static void main(String[] args) {
//        int num1 = (int)(Math.random()*21);
//        int num2 = (int)(Math.random()*21);
//        int counter = 1;
//        System.out.println(num2 + ", " + num1);
//        while (num1 != num2) {
//            num1 = (int)(Math.random()*21);
//            num2 = (int)(Math.random()*21);
//            counter++;
//            System.out.println(num2 + ", " + num1);
//        }
//        System.out.println("Generovalo to " + counter);


//        int kolikrat = 0;
//
//        for (int i = 0; i < 100; i++) {
//            int num1 = (int)(Math.random()*21);
//            int num2 = (int)(Math.random()*21);
//            System.out.println(num2 + ", " + num1);
//            if (num2 == num1){
//                kolikrat++;
//            }
//        }
//        System.out.println("Stejne cislo padlo " + kolikrat + " krat");

//        Scanner sc = new Scanner(System.in);
//
//        int input = sc.nextInt();
//        int vysledek = 1;
//
//        for (int i = input; i >0 ; i--) {
//            vysledek *= i;
//        }
//
//        System.out.println(input+"!" + "=" + vysledek);

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo");
        int input = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(input + " je prvocislo " + isPrime);


    }
}
