package metody;

import java.lang.foreign.PaddingLayout;

public class basics {
    static void printHello(){
        System.out.println("Hello world");
    }
    static void printGreeting(String name){
        System.out.println("Ahoj " + name);
    }
    static void sum (int a, int b){
        int cislo = a+b;
        System.out.println(a + " + " + b + " = ");
        System.out.println(cislo);
    }
    static int multiplication (int a, int b){
        int result = a*b;
        return result;
    }

    public static void main(String[] args) {
       printHello();
       printGreeting("Karel");
       printGreeting("Honza");
       sum(2,5);
       sum(-5,20);
       int multiplicationResult = multiplication(5,3);
       System.out.println(multiplicationResult);





    }
}
