package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean("calculator");
        //When
        double a =calculator.add(2,2);
        double b =calculator.sub(2,2);
        double c =calculator.mul(2,2);
        double d =calculator.div(2,2);
        //Then
        Assert.assertEquals(4,a,0);
        Assert.assertEquals(0,b,0);
        Assert.assertEquals(4,c,0);
        Assert.assertEquals(1,d,0);
    }
}
