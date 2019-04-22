package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Continent {
    private final String continentName;
    private final List<Country> listOfCountries= new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }
    public void addCountry(Country country){
        listOfCountries.add(country);
    }
    public List<Country> getListOfCountries(){
        return listOfCountries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;
        Continent continent = (Continent) o;
        return continentName.equals(continent.continentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continentName);
    }
}
