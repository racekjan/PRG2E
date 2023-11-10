package pole;

public class ArraysClass {
    public static void main(String[] args) {
        int[] array = {1,2,-3,5,-9,0,0,0,9,65};
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 1){
                System.out.println(array[i]);
                counter++;
            }
        }
        System.out.println("Pocet cisel mensich nez 1" + counter);

        //vypis pole pozpatku
        int[] yarra = {1,2,3,4,5,6,7,8,9};

        for (int i = yarra.length-1; i >= 0; i--) {
            System.out.println(yarra[i]);
        }
        System.out.println("----------");
        //soucet vsech prvku v poli
        int[] sum = {1,2,3,4,5,6};
        int totalSum = 0;
        for (int i = 0; i < sum.length; i++) {
            totalSum = totalSum + sum[i];
        }
        System.out.println(totalSum);
        System.out.println("----------");

        int[] zigzag = {1,2,3,4,5,6};
        for (int i = 0; i < zigzag.length/2; i++) {
            System.out.println(zigzag[i]);
            System.out.println(zigzag[zigzag.length - i - 1]);
        }
        System.out.println("----------");


    }
}
