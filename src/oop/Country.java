package oop;

public class Country {
    private String name;
    private double area;
    private int population;
    private String countryCode;

    public Country(String name, double area, int population, String countryCode) {
        this.name = name;
        this.area = area;
        this.population = population;
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public int getPopulation() {
        return population;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setArea(double area) {
        if (area>=0){
            this.area = area;
        }
    }

    public void setPopulation(int population) {
        if (population>=0){
            this.population = population;
        }
    }

    public void setCountryCode(String countryCode) {
        if (countryCode.length()==3) {
            this.countryCode = countryCode;
        }
    }

    public static void main(String[] args) {
        Country a = new Country("Australia",774112200.00,26433762,"AUS");
        Country c= new Country("Canada",9985000.00, 39500000,"CAN");

        if (a.getPopulation() > c.getPopulation()){
            System.out.println(a.getName());
        }else {
            System.out.println(c.getName());
        }

    }
}
