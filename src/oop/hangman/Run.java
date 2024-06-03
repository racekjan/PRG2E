package oop.hangman;

public class Run {
    public static void main(String[] args) {
//        System.out.println("Test input:");
        Reader r = new Reader();
        //String in = r.ReadInput();
        //System.out.println("ulozeno: " + in);
        Player p = new Player("Test");
        Game game = new Game(p,r);
        game.startGame();
    }
}
