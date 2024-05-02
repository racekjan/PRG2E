package oop;

import java.time.LocalDate;

public class ExampleDates {
    public static void main(String[] args) {
        LocalDate ted = LocalDate.now();
        System.out.println("Ted je: " + ted);
        System.out.println(ted.getDayOfWeek());
        System.out.println(ted.getDayOfMonth());
        System.out.println(ted.getDayOfYear());
    }
}
