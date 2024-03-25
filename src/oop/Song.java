package oop;

import javax.swing.*;

public class Song {
    String name;
    String author;
    int yearOfRelease;
    double rating;
    int duration;
    public void printInfo(){
        System.out.println("Song: " + name);
        System.out.println("Written by: " + author);
        System.out.println("Released in: " + yearOfRelease);
        System.out.println("Rated: " + rating + "/10");
    }
}
