package testy;

public class test_metody {
    static double parkingSpot (int mistaPocet, int dayPrice, int days){
        double price = 0;
        if (days<10){
            price = mistaPocet*dayPrice*days;
        }else {
            price = (mistaPocet*dayPrice*days)*0.9;
        }
        return price;
    }
    static void newerDate (String date, String otherDate){
        String bigger = "";
        String[] dateSplited = date.split(".");
        String[] otherDateSplited = otherDate.split(".");
        int day1 = Integer.parseInt(dateSplited[0]);
        int day2 = Integer.parseInt(otherDateSplited[0]);
        int month1 = Integer.parseInt(dateSplited[1]);
        int month2 = Integer.parseInt(otherDateSplited[1]);
        int year1 = Integer.parseInt(dateSplited[2]);
        int year2 = Integer.parseInt(otherDateSplited[2]);
        if (year2>year1){
            System.out.println(otherDate + "je novejsi");
        } else if (year2<year1) {
            System.out.println(date + "je novejsi");
        }else if (month2>month1){
            System.out.println(otherDate + "je novejsi");
        } else if (month1>month2) {
            System.out.println(date + "je novejsi");
        } else if (day2>day1) {
            System.out.println(otherDate + "je novejsi");
        } else if (day1>day2) {
            System.out.println(otherDate + "je novejsi");
        }


    }
    static String checkPulse (int[]pulses){
        for (int i = 0; i < pulses.length; i++) {
            if (pulses[i]==0){
                return "Dead";
            }
        }
        for (int i = 0; i < pulses.length-1; i++) {
            int rozdil = pulses[i+1]-pulses[i];
            if (rozdil>30){
                return "Danger";
            }
        }
        return "OK";
    };
    public static void main(String[] args) {
//        //1
//        int[] array = {40,10,5};
//        System.out.println(checkPulse(array));
//        //2
//        System.out.println(parkingSpot(1,20,11));
        //3
        newerDate("1.1.2000","1.1.2020");


    }
}
