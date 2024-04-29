package oop;

public class Match {
    private int hostScore;
    private int visitingScore;

    public Match(int hostScore, int visitingScore) {
        this.hostScore = hostScore;
        this.visitingScore = visitingScore;
    }

    public int getHostScore() {
        return hostScore;
    }

    public int getVisitingScore() {
        return visitingScore;
    }

    void getResult(){
        if(hostScore>visitingScore){
            System.out.println("Vyhráli domácí");
        }else if (hostScore<visitingScore) {
            System.out.println("Vyhráli hosté");
        }else {
            System.out.println("Remíza");
        }
    }
}
