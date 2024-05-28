package oop.maze;

import java.util.Scanner;

public class Player {
    String nickname;
    int x,y;

    public Player(String nickname, int x, int y) {
        this.nickname = nickname;
        this.x = x;
        this.y = y;
    }

    String readMove(){
        System.out.println("Vyber si smer (a,w,s,d): ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        switch (input){
            case "a": y--; break;
            case "w": x--; break;
            case "s": x++; break;
            case "d": y++; break;
            default:
                System.out.println("Spatny input");
                return "X";
        }
        return input;
    }
}
