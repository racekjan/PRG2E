package procvicovani;

import java.util.Arrays;

public class metody_procv {
    static int getMax (int[]array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
    static int dayCount(int day, int month){
        int[] daysInMonth = {31,29,31,30,31,30,31,31,30,31,30,31};
        int totalDays = 0;
        for (int i = 0; i < month-1; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays+=day;
        return totalDays;
    }
    static int dayCount2 (int day, int month, int year){
        boolean ok = isLeapYear(year);
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        int[] daysInMonthLeap = {31,29,31,30,31,30,31,31,30,31,30,31};
        int totalDays = 0;
        if (ok){
            for (int i = 0; i < month-1; i++) {
                totalDays += daysInMonthLeap[i];
            }
        }else {
            for (int i = 0; i < month-1; i++) {
                totalDays += daysInMonth[i];
            }
        }
        totalDays+=day;
        return totalDays;


    }
    static boolean isLeapYear(int year){
        boolean ok = year % 4 == 0;
        return ok;
    }
    static void textAnalysis(String text){
        String[] words = text.split("\\s+");
        int wordCount = words.length;
        System.out.println("Pocet slov: " + wordCount);
        String[] sentenses = text.split("[.!?]");
        int sentecesCount = sentenses.length;
        System.out.println("Pocet vet: " + sentecesCount);
    }
    static boolean isTriangle (int a, int b, int c){
        if (a+b>c && a+c>b && b+c>a){
            return true;
        }else {
            return false;
        }
    }
    static double triangleArea (int a, int b, int c){
        if (isTriangle(a,b,c)) {
            double s = (a + b + c) / 2.0;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }else  {
            return -1;
        }
    }
    static int digitsSum (String number){
        int sum = 0;
        int[] poleCisel = new int[number.length()];

        for (int i = 0; i < number.length(); i++) {
            poleCisel[i] = Character.getNumericValue(number.charAt(i));
        }
        for (int i = 0; i < poleCisel.length; i++) {
            sum+=poleCisel[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        //1
//        int[] numbers = {1,3,4,6,7,8,9,10,0};
//        System.out.println(getMax(numbers));
        //2
//        System.out.println(dayCount(5,2));
        //3
//        System.out.println(dayCount2(2,3,2024));
        //4
//        textAnalysis("dhasdhkasdassjkdaskjdas dhjkcasdjk asdjaskdcja dasda. asduidaskdj. uidasd ajlsdjkasd. asdsa.");
        //5
//        if (isTriangle(4,3,5)){
//            System.out.println(triangleArea(4,3,6));
//        }else {
//            System.out.println("Není to trojúhelník");
//        }
        //6
//        System.out.println(digitsSum(String.valueOf(45785527)));



    }
}
