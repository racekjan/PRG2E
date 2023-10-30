package pole;

public class ArraysBasic {
    public static void main(String[] args) {
            //staticke vytvoreni pole
//            int[] pole = {45, 125, 19, 25, 27, 42};
//            System.out.println(pole[4]);

            int[] dalsiPole = new int[10];
//            dalsiPole[2] = 9;

            for (int i = 0; i < dalsiPole.length; i++) {
            dalsiPole[i] = (int)(Math.random()*1000 + 1);
            }
        
            System.out.println("Vypis pole");
            for (int i = 0; i < dalsiPole.length; i++) {
                System.out.print(dalsiPole[i] + " ");
            }

            
    }
}
