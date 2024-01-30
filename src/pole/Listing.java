package pole;

import java.util.ArrayList;

public class Listing {
    public static void main(String[] args) {
        ArrayList<Integer> bigArray = new ArrayList<>(); //vytvoreni
        //ukladani - napr. 20 mahodnych prvku
        bigArray.add(10); //prvni volne misto - casteji pouzivane
        bigArray.add(1,20); //na index 1

        for (int i = 0; i < 20; i++) {
            bigArray.add(i+1);
        }
        //vypis varianta 1
        System.out.println(bigArray);

        //vypis varianta 2
        System.out.println(bigArray.get(5));//vytahne prvek na indexu 5

        //ziskani velikosti pole/listu
//        for (int i = 0; i < bigArray.size(); i++) {
//            System.out.println(bigArray.get(i));
//        }

        //obsahuje prvek?
        System.out.println(bigArray.contains(5));

        //kde je ten prvek?
        System.out.println(bigArray.indexOf(15));

        //kde je ten prvek naposledy?
        System.out.println(bigArray.lastIndexOf(20));

        //odstraneneni prvku
        bigArray.clear();//vsech
        System.out.println(bigArray);
        for (int i = 0; i < 10; i++) {
            bigArray.add(i*5);
        }
        System.out.println(bigArray);
        bigArray.remove(3);//odstraneni prvku na indexu
        System.out.println(bigArray);

        bigArray.isEmpty();//je tam vubec neco?
//        boolean isEmpty = bigArray.size()==0;

        ArrayList<Integer> evenBiggerArray = new ArrayList<>();
        System.out.println(evenBiggerArray);

        evenBiggerArray.addAll(bigArray);//nakopirovani do pole
        System.out.println(evenBiggerArray);

        for (int i = 10; i < 100; i+=10) {
            evenBiggerArray.add(i);
        }

        System.out.println(bigArray);
        System.out.println(evenBiggerArray);
        //
        //


    }
}
