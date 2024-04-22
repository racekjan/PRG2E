package testy;

public class SlotMachine {
    int balance;
    int debt;

    public SlotMachine(int balance, int debt) {
        this.balance = balance;
        this.debt = debt;
    }

    void bet(){
        int random1 = (int)(Math.random()*8-1);
        int random2 = (int)(Math.random()*8-1);
        int random3 = (int)(Math.random()*8-1);
        if (this.balance>=150){
            this.balance-=150;
            if (random1==random2 && random2 == random3){
                this.balance+=1500;
            }
        }
    }
    void getBalance(){
        System.out.println(this.balance);
    }

    void loan(int how){
        this.balance=+how;
        this.debt+=how*1.5;
    }
}
