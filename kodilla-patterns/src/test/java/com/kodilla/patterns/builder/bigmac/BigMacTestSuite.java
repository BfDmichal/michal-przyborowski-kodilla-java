package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testCreateBigMac(){
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .Bun("Big")
                .Burgers(2)
                .Sauce("Spicy")
                .Ingredient("Salad")
                .Ingredient("Cheese")
                .build();
        System.out.println(bigMac);
        //When
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(2,howManyIngredients);
        Assert.assertNotNull(bigMac.getBun());
    }
}
