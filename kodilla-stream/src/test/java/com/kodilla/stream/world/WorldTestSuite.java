package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetWorldPopulation(){
        //Given
        World world = new World();
        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("China","56413215431353"));
        asia.addCountry(new Country("South Korea","546546546"));
        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Poland","435216482"));
        europe.addCountry(new Country("Portugal","45187664"));
        world.addContinent(asia);
        world.addContinent(europe);
        //When
        BigDecimal total = world.getPeopleQuantity();
        BigDecimal total1 = new BigDecimal("56414242382045");
        //Then
        Assert.assertEquals(2,world.getListOfContinents().size());
        Assert.assertEquals(total1,total);
    }
}