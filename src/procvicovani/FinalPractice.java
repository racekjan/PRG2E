package procvicovani;

import testy.konstrukce.Mail;
import testy.konstrukce.Server;
import testy.konstrukce.User;

public class FinalPractice {
    public static void main(String[] args) {
        Mail[] mails = new Mail[5];
        for (int i = 0; i < mails.length; i++) {
            mails[i]=new Mail(new User("John","john@gmail.com"),
                    new User("Carl", "carl@gmail.com"),
                    new Server("borec","192.16.0.1"),
                    "22-06-24");
        }
    }
}
