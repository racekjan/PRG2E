package pole;

import javax.swing.*;
import java.sql.SQLOutput;

public class MultiArraysPractice {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        //vygenerovani
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=(int)(Math.random()*90+10);
            }
        }
        //vypsani
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

            //uzivatel zada cislo radku a vypiseme ho
//        System.out.println("Radky");
//        String input = JOptionPane.showInputDialog("Zadej cislo radku");
//        int row = Integer.parseInt(input);
//        for (int i = 0; i < matrix[row].length; i++) {
//            System.out.print(matrix[row][i]+ " ");
//        }
//            //uzivatel zada cislo sloupce a vypiseme ho
//        System.out.println();
//        System.out.println("Sloupce");
//        input = JOptionPane.showInputDialog("Zadej cislo sloupce");
//        int col = Integer.parseInt(input);
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(matrix[i][col]);
//        }
//        System.out.println();

        //vypis prumery kazdeho pole a pak prumer poli
        int sumPartial = 0;
        int sumTotal = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumPartial = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumTotal += matrix[i][j];
                sumPartial += matrix[i][j];
            }
            System.out.println("Prumer pole " + i + ": " + ((double)sumPartial/matrix[i].length));
        }
        System.out.println("Prumer vseho = " + ((double)sumTotal/(matrix.length* matrix.length)));

        //vypis ve formatu trojuelniku
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
