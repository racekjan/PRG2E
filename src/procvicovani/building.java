package procvicovani;

public class building {
    public static void main(String[] args) {
        String greeting = "Hello";
        greeting+= " world";
        System.out.println(greeting);

        String word = "something";
        String drow = "";
        for (int i = word.length()-1;i >=0; i--) {
            drow+=word.charAt(i);
        }
        System.out.println(word);
        System.out.println(drow);

        StringBuilder bob = new StringBuilder("hello");
        System.out.println(bob);
        bob.reverse();
        System.out.println(bob);

        bob.insert(2,"SECRET");
        System.out.println(bob);

        bob.append(" World!");
        System.out.println(bob);

        System.out.println(bob.indexOf("SEC"));
        System.out.println(bob.lastIndexOf("E"));

        if (bob.lastIndexOf("q") == bob.indexOf("q") && bob.indexOf("q")>-1){
            System.out.println("Je prave jednou");
        }else if (bob.indexOf("q") == -1){
            System.out.println("Neni vubec");
        } else {
            System.out.println("Je vicekrat");
        }


    }
}
