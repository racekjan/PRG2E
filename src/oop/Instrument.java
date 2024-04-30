package oop;

public class Instrument {
    //obycejne parametry - vazane na konkretni nastroj
    String type;
    String name;
    int price;

    //vazana na celou tridu
    static int instrumentSold = 0;
    public Instrument(String type, String name, int price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    void sellInstrument(){
        instrumentSold++;
    }

    static void amountPrinted(){
        System.out.println("Instrument sold: " + instrumentSold);
    };



}
