package oop.world;

public class City {
    Country country;
    int cityPopulation;
    String city;

    public City(Country country, int cityPopulation, String city) {
        this.country = country;
        this.cityPopulation = cityPopulation;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Město " + city + " leží v " + country + " a " + cityPopulation;
    }
}
