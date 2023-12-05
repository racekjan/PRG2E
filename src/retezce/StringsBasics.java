package retezce;

import java.util.Scanner;

public class StringsBasics {
    public static void main(String[] args) {
//        char input = 'A';
//        input = '9';
//        System.out.println(input+1);
//        input = '\n';//odradkovani
//        System.out.println("Hello" + input + "world");
//        input = '\t';//tabulator
//        System.out.println("Hello" + input + "world");
//        //porovnavani
//        char a = 'a';
//        char A = 'A';
//        if (a==A){
//            System.out.println("jsou stejny");
//        }
//
//        String hello = "Hello!";
//        String ehllo = "Hello!";
//        if (hello==ehllo){
//            System.out.println("jsou stejny");
//        }
//
//        Scanner sc = new Scanner(System.in);
//        String ehlo = sc.nextLine();
//        System.out.println("zadal jsi" + ehlo);


//        if (ehlo==hello){
//            System.out.println("jsou stejny");
//        }
        //problem s "Helllo!/ESC"
        // u stringu nepouzivat ==!

//        if (hello.equals(ehlo)){
//            System.out.println("jsou stejny");
//        }

        String showcase = "Obsah \t\t stri\nngu";
        System.out.println(showcase);
        String more = showcase + "Hello";
        System.out.println(more);
        //case sensitive
        boolean same = "hello".equals("Hell0");
        String helloTest = "HelLo wOrlD";
        String Upper = helloTest.toUpperCase();
        System.out.println(Upper);
        System.out.println("Pismeno na 2" + helloTest.charAt(2));
        System.out.println("Kde je 'l'?" + helloTest.indexOf('l'));
    }
}
