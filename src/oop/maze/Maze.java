package oop.maze;

import com.sun.source.tree.BreakTree;

public class Maze {
    int[][] mazeArray;
    char wall, playerIcon, freeSpace, treasure;
    Player player;
    public Maze(int[][] mazeArray, char wall, char playerIcon, char freeSpace, char treasure, Player player) {
        this.mazeArray = mazeArray;
        this.wall = wall;
        this.playerIcon = playerIcon;
        this.freeSpace = freeSpace;
        this.treasure = treasure;
        this.player = player;
    }
    void printMaze(){
        for (int i = 0; i < mazeArray.length; i++) {
            for (int j = 0; j < mazeArray[i].length; j++) {
                if (i == player.x && j == player.y){
                    System.out.print(playerIcon);
                }else {
                    System.out.print(getCharacter(mazeArray[i][j]));
                }
            }
            System.out.println();
        }
    }
    char getCharacter(int mazeValue){
        switch (mazeValue){
            case 0: return freeSpace;
            case 1: return wall;
            case 2: return playerIcon;
            case 3: return treasure;
        }
        return 'x';
    }

    void game(){
        printMaze();
        while (mazeArray[player.x][player.y] != 3){
            player.readMove();
            printMaze();
            if (hitWall()){
                System.out.println("Narazil jsi do zdi, hra je ukoncena");
                return;
            }
        }
        System.out.println("Nasel jsi poklad, hra je ukoncena..");
    }

    boolean hitWall(){
        return mazeArray[player.x][player.y] == 1;
    }


    public static void main(String[] args) {
        int[][] mazeArray= {
            {1,1,1,1,1,1,1},
            {1,0,0,0,0,0,1},
            {1,0,1,1,1,0,1},
            {1,0,1,0,0,0,1},
            {1,0,1,3,1,0,1},
            {1,1,1,1,1,1,1},
        };
        Player p = new Player("John",4,1);

        Maze m = new Maze(mazeArray, '#','O',' ', '+', p);
        m.game();
    }


}
