package metody;

public class recursionPractice {
    static void countdown (int n){
        if (n<1){
            return;
        }
        System.out.println(n);
        countdown(n-1);
    }
    static int factorial (int n){
        if (n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
//        countdown(6);
        System.out.println(factorial(5));
    }
}
