package procvicovani;

import javax.swing.*;
import java.util.Scanner;

public class validate {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        String input = JOptionPane.showInputDialog("Zadej IP");
        String[] parts = input.split("\\.");
        if (parts.length==3){
            System.out.println("Delka OK");
        }

    }
}
