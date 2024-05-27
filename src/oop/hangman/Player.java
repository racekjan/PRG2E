package oop.hangman;

public class Player {
    String name;
    int attemps;
    final int DEFULT_ATTEMPS = 12;

    public Player(String name) {
        this.name = name;
        attemps = 12;
    }

    void resetAttemps(){
        attemps = DEFULT_ATTEMPS;
    }
}
