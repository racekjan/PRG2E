package oop;

public class Ticking {
    public static void main(String[] args) {
        Clock basic = new Clock(0,0,0,true);

        while (basic.hours<3){
            basic.tick();
            basic.printTime();
        }

        Clock dalsi = new Clock(16,30,0,true);
        System.out.println("Casy:");
        dalsi.printTime();
        basic.printTime();
        System.out.println("Rozdil: " + basic.difference(dalsi));

        Clock fixed = new Clock(0,0,0,false);
        fixed.hours=10;


    }
}
