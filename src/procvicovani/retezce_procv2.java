package procvicovani;

import java.util.Scanner;

public class retezce_procv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String heslo = sc.nextLine();
//        boolean ok = false;
//        while (ok==false){
//            char[] hesloArray = heslo.toCharArray();
//            if ((hesloArray.length==8){
//                if (heslo.charAt(0)=='H'){
//                    if (heslo.indexOf('*')>=0){
//                        ok = true;
//                    }
//                }
//            }
//            if (ok==false){
//                System.out.println("zkus to znovu");
//                heslo=sc.nextLine();
//            }
//        }
//        System.out.println("heslo je ok");

//        String[] spanishPhrases = {"El camino", "La Bomba", "El Pistolero", "Elephant", "Lancelot"};
//        for (int i = 0; i < spanishPhrases.length; i++) {
//            if (spanishPhrases[i].contains("El ") || spanishPhrases[i].contains("La ") || spanishPhrases[i].contains("A ")){
//                System.out.println(spanishPhrases[i]);
//            }
//        }

        String text = "dasdas*sdas*asdcs*asdcas*casd*";
        char[] textArray = text.toCharArray();
        int counter = 0;
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i]=='*'){
                counter++;
            }
        }
        System.out.println("Znak * se v poli vyskytuje " + counter + " krat");

    }
}
