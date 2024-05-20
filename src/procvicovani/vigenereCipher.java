package procvicovani;

import java.util.Arrays;

public class vigenereCipher {
    public static void main(String[] args) {
        String text = "F3vnv4_xz4R_eU3j4V_Ab48q1mF3vnv4_xz4R_eU3j4V_Ab48q1m";
        String key = "secure";
        text = text.toLowerCase();
        key = key.toLowerCase();
        char[] textArray = text.toCharArray() ;
        char[] keyArray = key.toCharArray();
        int[] textIndexy = new int[textArray.length];
        int[] keyIndexy = new int[keyArray.length];
        int[] keyCisla = new int[keyIndexy.length];
        int[] keysAlphNums = new int[textArray.length];
        char[] abeceda = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String abecedaString = "abcdefghijklmnopqrstuvwxyz";
        char currentChar = ' ';
        String output = "";
        for (int i = 0; i < keyArray.length; i++) {
            currentChar =  keyArray[i];
            keyIndexy[i]=abecedaString.indexOf(currentChar);
        }
        for (int i = 0; i < textArray.length; i++) {
            currentChar = textArray[i];
            textIndexy[i]=abecedaString.indexOf(currentChar);
        }
        for (int i = 0; i < keyArray.length; i++) {
            keyCisla[i]=i;
        }
        for (int i = 0; i < textArray.length; i++) {
            for (int j = 0; j < keyArray.length; j++) {
                if (i * keyArray.length + j < keysAlphNums.length) {
                    keysAlphNums[i * keyArray.length + j] = j;
                }
            }
        }
        for (int i = 0; i < textArray.length; i++) {
            if (textIndexy[i]+keyIndexy[keysAlphNums[i]]< abeceda.length){
                currentChar = abeceda[textIndexy[i]+keyIndexy[keysAlphNums[i]]+1];
                output+=currentChar;
            }else {
                currentChar = abeceda[(textIndexy[i]+keyIndexy[keysAlphNums[i]]+1)-26];
                output+=currentChar;
            }
        }
        System.out.println(output);

    }
}
