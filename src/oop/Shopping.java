package oop;

public class Shopping {
    public static void main(String[] args) {
        WineShop winery = new WineShop();
        winery.price = 350;
        winery.balance = 5000;
        winery.buy(15);
        winery.printBalance();

        winery.sell(10);
        winery.printBalance();
    }
}
