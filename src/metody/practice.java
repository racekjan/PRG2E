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
    static void hourMinuteSecond (int second){
        int hours = second/3600;
        int remainingSeconds = second%3600;
        int minutes = remainingSeconds/60;
        int seconds = remainingSeconds%60;
        System.out.println(hours + ":" + minutes +":" + seconds);
    }
    public static void main(String[] args) {
//        int randomNumber = random(1,500);
//        System.out.println(Arrays.toString(randomArray(10,-100,100)));
//        timeConvert(80);
        hourMinuteSecond(3674);



    }
}
