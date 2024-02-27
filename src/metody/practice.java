package metody;

import java.util.Arrays;
import java.util.Scanner;

public class practice {
    static void greetings(String name){
        System.out.println("Ahoj " + name);
    }
    static int recentagleArea(int width, int height){
        return height*width;
    }
    static int random (int min, int max){
        return (int)(Math.random() * (max - min+1) + min);
    }
    static int[] randomArray(int length, int min, int max){
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random(min, max);
        }
        return array;
    }
    static void timeConvert (int seconds){
        int minutes = seconds/60;
        int remainingSeconds = seconds%60;
        System.out.println(minutes + ":" + remainingSeconds);
    }
    public static void main(String[] args) {
        int randomNumber = random(1,500);
        System.out.println(Arrays.toString(randomArray(10,-100,100)));
        timeConvert(80);



    }
}
