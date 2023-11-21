package pole;

public class ArraysPrevod {
    public static void main(String[] args) {
        int[] pole = {1,1,1,1,1};
        int[] mocniny = {256,128,64,32,16,8,4,2,1};
        int delka = pole.length-1;
        int delkaMocniny = mocniny.length-1;
        int vysledek = 0;
        for (int i = 0; i < pole.length; i++) {
            if (pole[delka]==1){
                vysledek=vysledek+mocniny[delkaMocniny];
            }
            delka--;
            delkaMocniny--;
        }
        System.out.println(vysledek);
    }
}
