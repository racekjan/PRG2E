package procvicovani;

import javax.swing.*;
import java.sql.Array;
import java.util.Scanner;

public class validate {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        boolean ok = true;
        String input = JOptionPane.showInputDialog("Zadej IP"); //lepsi nez scanner
        System.out.println("Zadal jsi: " + input);
        String[] parts = new String[0];
        if (input==null){
            ok = false;
            System.out.println("Nebylo nic zadano");
        }
        if (ok){
            parts = input.split("\\.");
            if (parts.length==4){
                System.out.println("Delka OK");
            }else {
                System.out.println("Neni format IP adresy.");
                ok = false;
            }
        }
        //kontrola zda tam jsou cisla
        for (int i = 0; i < parts.length && ok; i++) {
            for (int j = 0; j < parts[i].length() && ok; j++) {
                char current = parts[i].charAt(j);
                if (Character.isDigit(current)){
                    System.out.println(current + ".... je cislo");
                }else {
                    System.out.println("Nejsou zadana cisla");
                    ok = false;
                    break;
                }
            }
        }
        //overeni jestli jsou cisla ok
        for (int i = 0; i < parts.length  && ok; i++) {
            int number = Integer.parseInt(parts[i]);
            if (number >= 0 && number <= 255){
                System.out.println((i+1) + "/" + parts.length + " OK");
            }else {
                System.out.println("Cisla nejsou v intervalu IP adresy.");
                ok =false;
                break;
            };
        }

        if (ok){
            System.out.println("Zadal jsi IP adresu");
        }else {
            System.out.println("Nebyla zadana IP adresa");
        }




    }
}
