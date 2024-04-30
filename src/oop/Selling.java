package oop;

public class Selling {
    public static void main(String[] args) {
        Instrument violin = new Instrument("string type","Violin",8500);
        violin.sellInstrument();
        Instrument organ = new Instrument("mixed", "Organ",220000);
        Instrument piano = new Instrument("string type", "piano",35000);
        System.out.println(Instrument.instrumentSold);
        Instrument.amountPrinted();
    }
}
