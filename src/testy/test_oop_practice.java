package testy;

public class test_oop_practice {
    public static void main(String[] args) {
        ShoppingCart a = new ShoppingCart(500,20);
        a.add(200);
        a.remove(10);
        System.out.println(a.getPrice());

//        SlotMachine b = new SlotMachine(5000,0);
//        b.bet();
//        b.getBalance();
    }
}
