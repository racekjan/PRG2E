package procvicovani;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class list2Dpole_procv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(i+1);
//        }
//        for (int i = list.size()-1; 0 <= i; i--) {
//            System.out.println(list.get(i));
//        }

        //2.
//        int[][] cisla = new int[5][5];
//        for (int i = 0; i < cisla.length; i++) {
//            for (int j = 0; j < cisla[i].length; j++) {
//                cisla[i][j] = (int)(Math.random()*10+1);
//            }
//        }
//        System.out.println("Zadej cislo sloupce");
//        int sloupec = sc.nextInt();
//        int sum = 0;
//        for (int i = 0; i < cisla.length; i++) {
//            sum += cisla[i][sloupec];
//        }
//        System.out.println(sum);

        //3.
//        ArrayList<String> espanyol = new ArrayList<>();
//        System.out.println("Zadavej slova, zadavani ukoncis 'fin'");
//        String input = sc.nextLine();
//        while (!input.equals("fin")){
//            espanyol.add(input);
//            input = sc.nextLine();
//        }
//        String currentWord = "";
//        for (int i = 0; i < espanyol.size(); i++) {
//            currentWord = espanyol.get(i);
//            if (currentWord.startsWith("el ") || currentWord.startsWith("la ") || currentWord.startsWith("un ")){
//                System.out.println(currentWord);
//            }
//        }

        //4.
//        int removed = 0;
//        int currentNum = 0;
//        ArrayList <Integer> randomNumbers = new ArrayList<>();
//        for (int i = 0; i <= 100; i++) {
//            randomNumbers.add((int)(Math.random()*100));
//        }
//        for (int i = 0; i <= randomNumbers.size()-1; i++) {
//            currentNum =  randomNumbers.get(i);
//            if (currentNum<50){
//                randomNumbers.remove(i);
//                removed++;
//                i--;
//            }
//        }
//        System.out.println(removed);
//        System.out.println(randomNumbers);

        //5.
//        double average = 0;
//        int coutner = 0;
//        int[][] review = {{1,5,3,2,6}, {4,5,2,5,6},{9,9,7,8,9},{3,3,1,1,2}};
//        for (int i = 0; i < review.length; i++) {
//            average = 0;
//            for (int j = 0; j < review[i].length; j++) {
//                average += review[i][j];
//            }
//            average = average/review[i].length;
//            if (average>7.5){
//                coutner++;
//            }
//        }
//        System.out.println(coutner);


        


    }
}
