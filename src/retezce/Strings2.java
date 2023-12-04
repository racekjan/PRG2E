package retezce;

import java.util.Scanner;

public class Strings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Zadej mozne heslo");
//        String passsword = sc.nextLine();
//        if (passsword.length() < 8){
//            System.out.println("Neplatne");
//        }else {
//            System.out.println(passsword + " je OK");
//        }
//
//        System.out.println("uhadni heslo");
//        passsword = sc.nextLine();
//        String correctPassword = "secret";
//        if (passsword.equals(correctPassword)){
//            System.out.println("Spravne");
//        }else {
//            System.out.println("Spatne");
//        }

//        System.out.println("zadej rodne cislo");
//        String rc = sc.nextLine();
//        if (rc.charAt(6) == '/'){
//            System.out.println("RC ma na spravne pozici /");
//            if (rc.length() == 11){
//                System.out.println("RC ma spravnou delku");
//                if (rc.charAt(2) == '0' || rc.charAt(2) == '1'){
//                    System.out.println("jedna se o muze");
//                } else if (rc.charAt(2) == '5' || rc.charAt(2) == '6'){
//                    System.out.println("jedna se o zenu");
//                }
//            }
//        }

        //pole stringu
//        String[] passwords = {"bagr", "ananas", "rohlik"};
//        System.out.println("zkus uhadnout heslo:");
//        String guess = sc.nextLine();
//        for (int i = 0; i < passwords.length; i++) {
//            if (guess.equals(passwords[i])) {
//                System.out.println("Uhadl!");
//                break;
//            }
//        }
        
        String[] names = {"Ctirad Novák", "Oldřich Starý", "Jan Franta", "Filip Skočdopole", "Jan Bagr"};
        for (int i = 0; i < names.length; i++) {
            if (names[i].contains("Jan ")){
                System.out.println(names[i]);
            }
        }






    }
}
