package oop.references;

public class BankAccount {
    double balance;
    long bankID;
    Person owner;

    public BankAccount(double balance, long bankID, Person owner) {
        this.balance = balance;
        this.bankID = bankID;
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    void deposit(double balance){
        System.out.println(owner.getFullname() + " na ucet ulozil " + balance);
        this.balance += balance;
    }

    boolean withdraw (double amount){
        if (balance>=amount){
            balance-=amount;
            System.out.println(owner.getFullname() + " vybral z uctu " + amount);
            return true;
        }else {
            System.out.println(owner.getFullname() + " nemohl z uctu vybrat " + amount);
            return false;
        }
    }

    boolean transaction(BankAccount other, double amount){
        if (withdraw(amount)){
            other.deposit(amount);
            System.out.println(owner.getFullname() + " poslal " + amount + " na ucet uzivatele " + other.owner.getFullname());
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Person o1 = new Person("Karel", "CZE");
        Person o2 = new Person("Pepe", "CZE");
        BankAccount acc1 = new BankAccount(5000,45645645, o1);
        BankAccount acc2 = new BankAccount(1000,58456, o2);

        acc1.deposit(800);
        System.out.println(acc1.owner.getFullname() + " ma na uctu " + acc1.balance);

        acc2.withdraw(9000);

        acc1.transaction(acc2, 3000);
    }


}
