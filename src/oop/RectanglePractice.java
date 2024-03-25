package oop;

public class RectanglePractice {
    public static void main(String[] args) {
        Rectangle abc = new Rectangle();
        abc.width = 4;
        abc.height = 6;
        System.out.println("Obdelnik: W = "+abc.width+ " H = " + abc.height);
        System.out.println("Obsah: " + abc.getArea());
        System.out.println("Je to ctverec? " + abc.isSquare());

        Rectangle def = new Rectangle();
        def.height = 6;
        def.width = 6;
        System.out.println("Obdelnik: W = " + def.width+ " H = " + def.height);
        System.out.println("Obsah: " + def.getArea());
        System.out.println("Je to ctverec? " + def.isSquare());
    }
}
