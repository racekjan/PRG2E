package oop;

public class WineShop {
    int price;
    int count;
    int balance;
    public final int BUY_PRICE = 200;
    boolean sell (int count){
        if (this.count > count){
            balance+=count*price;
            System.out.println("Uspesne prodano");
            this.count-=count;
            return true;
        }else {
            System.out.println("Prodej nemozny - malo lahvi na sklade");
            return false;
        }
    }
    boolean buy (int count){
        if (balance>BUY_PRICE*count){
            balance-=BUY_PRICE*count;
            this.count+=count;
            return true;
        }else {
            System.out.println("Koupe nemozna, malo financi");
            return false;
        }
    }
    void printBalance(){
        System.out.println("Prave je na ucte: " + balance);
        System.out.println("Na sklade: " + count + " lahvi");
    }


}
