package procvicovani;

public class regexes {
    public static void main(String[] args) {
        String num = "5a";
        String rcReg = "[0-9]{2}[[0-1][5-6]][0-3][0-9]/[0-9]{4}";   //regex pro overeni rodneho cisla
        if (num.matches("[0-9][a-z]")){
            System.out.println("Jsou stejne");
        }
    }
}
