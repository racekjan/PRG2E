package metody;

public class recursion {
    static int notRecursive (int root, int power){
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result*=root;
        }
        return result;
    }
    static int recursive (int root, int power){
        if (power == 1){
            return root;
        }
        return recursive(root, power-1)*root;
    }
    public static void main(String[] args) {
        System.out.println(notRecursive(2,21));
    }
}
