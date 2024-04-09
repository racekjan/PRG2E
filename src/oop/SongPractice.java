package oop;

public class SongPractice {
    public static void main(String[] args) {
        Song dreamOn = new Song("Dream on", "Aerosmith",
                1973, 9.8);
//        dreamOn.name = "Dream on";
//        dreamOn.author = "Aerosmith";
//        dreamOn.yearOfRelease = 1973;
//        dreamOn.rating = 9.8;
        dreamOn.printInfo();
    }
}
