package oop.world;

public class Country {
    String country;
    int population;
    CountryLanguage language;

    public Country(String country, int population, CountryLanguage language) {
        this.country = country;
        this.population = population;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Země " + country + " má jazyk" + language + " a zije v ni" + population;
    }
}
