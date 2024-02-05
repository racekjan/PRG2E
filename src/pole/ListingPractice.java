package pole;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class ListingPractice {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        String phoneNumber = "";
        System.out.println("Zadavej tel. cisla, zadavani ukoncis zadaninm -1");

        while (!phoneNumber.equals("-1")){
            phoneNumber = sc.nextLine();
            list.add(phoneNumber);
        };

        System.out.println("Zadano: " + list);
        String currentNumber;
        System.out.println("Ceska cisla:");
        for (int i = 0; i < list.size(); i++) {
            currentNumber = list.get(i);
            check = true;
            for (int j = 1; j < currentNumber.length(); j++) {
                Character currentSymbol = currentNumber.charAt(j);
                if (!Character.isDigit(currentSymbol)){
                    check=false;
                    break;
                }
            }
            if (currentNumber.startsWith("+420") && currentNumber.length()==13 && check){
                System.out.println(currentNumber);
            }
        }





    }
}
