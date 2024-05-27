package oop.hangman;

import java.util.ArrayList;

public class Game {
    String secret;
    ArrayList<String> checked;
    final String[] POOL = {"papuce", "srst", "nejkulatoulinkatejsi", "kavovar", "chirurgie"};
    Player p;
    Reader inputReader;

    public Game(Player p, Reader inputReader) {
        this.p = p;
        this.inputReader = inputReader;
    }

    void setupGame(){
        p.resetAttemps();
        checked = new ArrayList<>();

    }

    String pickRandomWord(){
        int randomIndex = (int)(Math.random() * POOL.length);
        System.out.println("CHEAT: " + POOL[randomIndex]);
        return POOL[randomIndex];
    }

}
