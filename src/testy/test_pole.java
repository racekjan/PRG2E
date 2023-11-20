package testy;

import java.util.Arrays;

public class test_pole {
    public static void main(String[] args) {
//        int min = -100;
//        int max = 100;
//        int sum = 0;
//        int[] pole1  = new int[10];
//        int[] pole2  = new int[10];
//        for (int i = 0; i < pole1.length; i++) {
//            pole1[i] = (int)(Math.random() * (max - min) + min);
//            pole2[i] = (int)(Math.random() * (max - min) + min);
//        }
//        for (int j = 0; j < pole1.length; j++) {
//            sum = sum + pole1[j] + pole2[j];
//        }
//        if (sum>0){
//            System.out.println("Positive sum");
//        }else {
//            System.out.println(sum);
//        }



//        int[] pole = new int[10];
//        int counter = 0;
//        for (int i = 0; i < pole.length; i++) {
//            pole[i] = (int)(Math.random()*100+1);
//        }
//
//        for (int j = 0; j < pole.length; j++) {
//            if (pole[j]>=10 && pole[j]<=20){
//                counter++;
//                System.out.println(pole[j]);
//            }
//        }
//        System.out.println("Pocet cisel v intervalu <10;20> je: " + counter);



        int[] pole = new int[8];
        double sum = 0;
        double prumer = 0;
        for (int i = 0; i < pole.length; i++) {
            pole[i] = (int)(Math.random()*100+1);
        }

        for (int j = 0; j < pole.length; j++) {
            sum=sum+pole[j];
        }
        System.out.println(Arrays.toString(pole));
        prumer=sum/ pole.length;
        System.out.println(prumer);

    }
}
