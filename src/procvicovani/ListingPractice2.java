package procvicovani;

import java.util.ArrayList;
import java.util.Scanner;

public class ListingPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ArrayList<String> usernames = new ArrayList<>();
//        String input = "";
//        System.out.println("Zadavej usernames, zadavani uoncis zadanim 'konec'");
//        input = sc.nextLine();
//        while (!input.equals("konec")){
//            if (!usernames.contains(input)){
//                usernames.add(input);
//                System.out.println(input + " pridano");
//            }else {
//                System.out.println("Jmeno uz v listu je");
//            }
//            input = sc.nextLine();
//        }
//        System.out.println(usernames);;

        //

//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int)(Math.random() * 16);
//            for (int j = 0; j < i; j++) {
//                while (...)
//            }
//        }

        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        int number;
        int counter= 0;
        while (uniqueNumbers.size()!=10){
            number=(int)(Math.random() * 16);
            if (!uniqueNumbers.contains(number)){
                uniqueNumbers.add(number);
            }
            counter++;
        }
        System.out.println(uniqueNumbers);
        System.out.println("Trvalo to " + counter + " pokusů");

        ArrayList<Integer> numbers = new ArrayList<>();
        int score;
        double chance = Math.random();
        while (chance > .49){
            score = (int)(Math.random()*101+100);
            numbers.add(score);
            chance = Math.random();
        }
        System.out.println(numbers);
        System.out.println(numbers.size());


    }
}
