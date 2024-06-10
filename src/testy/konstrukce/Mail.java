package testy.konstrukce;

public class Mail {
    User odesilatel;
    User prijemce;
    Server server;
    String date;

    public Mail(User odesilatel, User prijemce, Server server, String date) {
        this.odesilatel = odesilatel;
        this.prijemce = prijemce;
        this.server = server;
        this.date = date;
    }

    @Override
    public String toString() {
        return odesilatel + "," + prijemce;
    }

    void sendMail(String text){
        System.out.println(odesilatel + " posílá zprávu pro " + prijemce);
        System.out.println(text);
        System.out.println("Odesláno: " + date);
    }
    void printServerInfo(){
        System.out.println("Posílání zajišťuje server " + server.serverName + " na adrese " + server.IPAddress);
    }

    public static void main(String[] args) {
        Server s = new Server("Borec","123556");
        User odesilatel = new User("Karel","karel");
        User prijemce = new User("Pepik", "Pepik");
        Mail m = new Mail(odesilatel,prijemce,s,"10/6/24");
    }
}
