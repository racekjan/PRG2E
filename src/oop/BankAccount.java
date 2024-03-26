package oop;

public class BankAccount {
    long bid = 123456789123456L;
    int balance;
    String owner;
    void insert (int amount) {
        balance+=amount;
    }
    void withDraw (int amount){
        if (balance<amount){
            System.out.println("Malo penez");
        }else {
            balance -= amount;
        }
    }
    void transaction (int amount, BankAccount beneficiary){
       if (balance>amount){
           balance-=amount;
           beneficiary.balance+=amount;
       }else {
           System.out.println("Prevod se nezdaril");
       }


    }

}
