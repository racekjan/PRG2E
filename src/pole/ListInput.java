package pole;

import java.util.ArrayList;
import java.util.Scanner;

public class ListInput {
    public static void main(String[] args) {
        //uzivatel zadava prvky do pole
        // zadavani se ukonci zadanim -1
        // vypis vse, co uzivatel zadal

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Zadavej cisla, zadavani se ukonci zadanim -1");
        int input = sc.nextInt();
        while (input!=-1){
            numbers.add(input);
            input = sc.nextInt();
        }
        System.out.println("Zadano: ");
        System.out.println(numbers);

    }
}
