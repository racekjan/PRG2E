package oop;

import java.math.BigInteger;

public class PersonTest {
    public static void main(String[] args) {
        Osoba person = new Osoba();
        person.age = 21;
        person.name = "Karel";
        person.shoeSize = 47.75;
        person.intro();
        Osoba otherPerson = new Osoba();
        otherPerson.age = 30;
        otherPerson.name = "Pepik";
        otherPerson.shoeSize = 36.5;
        otherPerson.intro();
    }
}
