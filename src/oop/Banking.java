package oop;

public class Banking {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.balance = 1000;
        acc1.bid = 123789;
        acc1.owner = "Karel";

        acc1.insert(1000);
        System.out.println(acc1.balance);
        acc1.withDraw(500);
        System.out.println(acc1.balance);
        acc1.withDraw(20000);

        BankAccount acc2 = new BankAccount();
        acc2.balance=500;
        acc1.transaction(800,acc2);
        System.out.println("ACC1: " + acc1.balance);
        System.out.println("ACC2: " + acc2.balance);
    }
}
