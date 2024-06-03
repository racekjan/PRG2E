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
        secret = pickRandomWord();
    }

    String pickRandomWord(){
        int randomIndex = (int)(Math.random() * POOL.length);
        System.out.println("CHEAT: " + POOL[randomIndex]);
        return POOL[randomIndex];
    }
    void startGame(){
        System.out.println("Spustit hru?");
        if (inputReader.readInput().equals("y")){
            System.out.println("Hra zacala");
            setupGame();
            while (p.attemps>0 && checked.size()<secret.length()){
                makeAGuess();
            }
        }
        System.out.println("Hra ukoncena");

    }
    void printState(){
        //projde cele slovo secret
        //pokud pismeno v secret je odhaleno (je v listu checked)->vypis pismeno
        //pokud ne, vypis _
        for (int i = 0; i < secret.length(); i++) {
            String s = "" + secret.charAt(i);
            if (checked.contains(s)){
                System.out.print(secret.charAt(i));
            }else {
                System.out.print(" _ ");
            }
        }
        System.out.println();
    }
    void makeAGuess(){
        System.out.println("Pokusu zbyva: " + p.attemps);
        String guess = inputReader.readInput();
        if (secret.contains(guess)){
            System.out.println("Pismeno uhadnuto!");
            checked.add(guess);
            printState();
        } else {
            System.out.println("Nespravna volba");
            p.attemps--;
        }
    }


}


