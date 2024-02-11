package procvicovani;

import java.util.ArrayList;
import java.util.Scanner;

public class list2Dpole_procv {
    public static void main(String[] args) {
        //1.
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(i+1);
//        }
//        for (int i = list.size()-1; 0 <= i; i--) {
//            System.out.println(list.get(i));
//        }
        //2.
        int[][] cisla = new int[5][5];
        for (int i = 0; i < cisla.length; i++) {
            for (int j = 0; j < cisla[i].length; j++) {
                cisla[i][j] = (int)(Math.random()*10+1);
            }
        }
        System.out.println("Zadej cislo sloupce");
        Scanner sc = new Scanner(System.in);
        int sloupec = sc.nextInt();


    }
}
