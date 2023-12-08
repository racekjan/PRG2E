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

        char[] abeceda = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ','.'};
        String[] klic = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","//","///"};
        String input = sc.nextLine();
        input = Normalizer.normalize(input, Normalizer.Form.NFD);
        input= input.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        input=input.toLowerCase();
        int[] indexy = new int[input.length()];
        char[] inputPismena = input.toCharArray();
        for (int i = 0; i < inputPismena.length; i++) {
            for (int j = 0; j < abeceda.length; j++) {
                if (inputPismena[i]==abeceda[j]){
                    indexy[i] = j;
                }
            }
        }
        System.out.println(Arrays.toString(indexy));
        for (int i = 0; i < indexy.length; i++) {
            System.out.print(klic[indexy[i]]);
            if (indexy[i]!=26 || indexy[i]!=27){
                System.out.print("/");
            }else if (indexy[i]==26){
                System.out.print("//");
            }else {
                System.out.print("///");
                System.out.println();
            }
        }



    }
}
