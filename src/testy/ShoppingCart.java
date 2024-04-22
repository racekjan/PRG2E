package testy;

public class ShoppingCart {
    public double totalPrice;
    public int discount;

    public ShoppingCart(int totalPrice, int discount) {
        this.totalPrice = totalPrice;
        this.discount = discount;
    }

    public void add (int itemPrice){
        this.totalPrice+=itemPrice;
    }
    public void remove(int itemPrice){
        if (this.totalPrice-itemPrice<0){
            System.out.println("Neni co odstranit");
        }else {
            this.totalPrice -= itemPrice;
        }
    }
    public double getPrice (){
        this.totalPrice=this.totalPrice*(100-discount)/100*1.21;
        return this.totalPrice;
    }
}
