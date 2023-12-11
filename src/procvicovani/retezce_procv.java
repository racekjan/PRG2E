package procvicovani;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.Scanner;

public class retezce_procv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String userName = sc.nextLine();
//        String[] users = {"anonymous", "prostekarel", "hynekmacha", "gaudibylfrajer"};
//        for (int i = 0; i < users.length; i++) {
//            if (userName.equals(users[i])){
//                System.out.println("ano!, uzivatelske jsmeno " + userName + " se v poli nachazi!");
//            }
//        }

//        String text = "hello";
//        String yn = "ne";
//        for (int i = 0; i < text.length()-1; i++) {
//            char tohle = text.charAt(i);
//            char dalsi = text.charAt(i+1);
//            if (tohle==dalsi){
//                yn = "ano";
//            }
//        }
//        System.out.println(yn);


//        String words = "Modré slonice tancovaly pod lunárním světlem na střeše domu.";
//        int counter = 0;
//        String[] roztrhaneWords = words.split(" ");
//        System.out.println(roztrhaneWords.length);

//        String[] names = {"Jan","Karel","František Dlouhojmenný","Pablo Diego José Francisco de Paula Juan Nepomuceno María de los Remedios Cipriano de la Sanơsima Trinidad Ruiz y Picasso","Eva"};
//        String nejdelsi = "";
//        for (int i = 0; i < names.length; i++) {
//            if (nejdelsi.length()-1<names[i].length()-1){
//                nejdelsi=names[i];
//            }
//        }
//        System.out.println(nejdelsi);

//        String number = "1234567890";
//        char[] charakters = number.toCharArray();
//        int pozice = charakters.length-1;
//        for (int i = 0; i < charakters.length; i++) {
//            System.out.print(charakters[pozice]);
//            pozice--;
//        }

//        String name = "chichot";
//        String input = sc.nextLine();
//        String filename = name+"."+input;
//        System.out.println(filename);


        //bonusy

//        String palindrom= "rur";
//        int leve = 0;
//        int prave = palindrom.length()-1;
//        String an = "ne";
//        while (!(leve==prave)){
//            if (palindrom.charAt(leve)==palindrom.charAt(prave)){
//                an = "ano";
//            }
//            else {
//                break;
//            }
//            leve++;
//            prave--;
//        }
//        System.out.println(an);

        String palindrom = "jelenovipivonelej";
        String palindromReverse = "";
        int pozice = palindrom.length()-1;
        for (int i = 0; i <= palindrom.length()-1; i++) {
            palindromReverse+=palindrom.charAt(pozice);
            pozice--;
        }
        if (palindrom.equals(palindromReverse)){
            System.out.println("jedna se o palindrom");
        }else {
            System.out.println("nejedna se palindrom");
        }


    }
}
