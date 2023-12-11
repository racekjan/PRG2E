package procvicovani;

public class morseovka {
    public static void main(String[] args) {
        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", ".._.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ','.'};

        String text = "Hello world";
        String allLower = text.toLowerCase();
        String morseEncoded = "";
        for (int i = 0; i < text.length(); i++) {
            char currentChar = allLower.charAt(i);

            for (int j = 0; j < alphabet.length; j++) {
                if (currentChar == alphabet[j]) {
                    morseEncoded += morseCode[j] + "|";
                    break;
                } else if (currentChar == ' ') {
                    morseEncoded += "|";
                    break;
                }
            }
        }
        System.out.println(text + ": " + morseEncoded);



    }
}
