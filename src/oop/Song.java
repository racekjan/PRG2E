package oop;

import javax.swing.*;

public class Song {
    String name;
    String author;
    int yearOfRelease;
    double rating;

    public Song(String name, String author, int yearOfRelease, double rating) {
        this.name = name;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
    }


    public void printInfo(){
        System.out.println("Song: " + name);
        System.out.println("Written by: " + author);
        System.out.println("Released in: " + yearOfRelease);
        System.out.println("Rated: " + rating + "/10");
    }
}
