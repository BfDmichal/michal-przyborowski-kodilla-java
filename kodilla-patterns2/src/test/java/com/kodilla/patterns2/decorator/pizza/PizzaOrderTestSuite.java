package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        System.out.println("Basic pizza " + cost);
        assertEquals(new BigDecimal(25), cost);
    }

    @Test
    public void testBasicPizzaGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        //When
        String description = pizzaOrder.getDescription();
        //Then
        System.out.println("Basic pizza " + description);
        assertEquals("Pizza, cheese and tomato sos", description);
    }

    @Test
    public void testPizzaWithBaconGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new Bacon(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        System.out.println("Pizza with bacon " + cost);
        assertEquals(new BigDecimal(32), cost);
    }

    @Test
    public void testPizzaWithBaconGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new Bacon(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        System.out.println("Pizza with bacon " + description);
        assertEquals("Pizza, cheese and tomato sos + bacon", description);
    }

    @Test
    public void testPizzaWithBaconAndCheeseGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new Bacon(pizzaOrder);
        pizzaOrder = new Cheese(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        System.out.println("Pizza with bacon and extra cheese " + cost);
        assertEquals(new BigDecimal(37), cost);
    }

    @Test
    public void testPizzaWithBaconAndCheeseGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new Bacon(pizzaOrder);
        pizzaOrder = new Cheese(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        System.out.println("Pizza with bacon and extra cheese " + description);
        assertEquals("Pizza, cheese and tomato sos + bacon + extra cheese", description);
    }
}