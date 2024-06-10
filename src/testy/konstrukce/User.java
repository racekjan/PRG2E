package testy.konstrukce;

public class User {
    String name;
    String address;

    public User(String name, String address) {
        this.name = name;
        this.address = name + "@infis.cz";
    }

    @Override
    public String toString() {
        return name + "(" + address + ")";
    }
}
